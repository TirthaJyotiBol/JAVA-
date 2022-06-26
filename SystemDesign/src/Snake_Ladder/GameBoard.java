package Snake_Ladder;
import java.util.*;
public class GameBoard {
	int boardSize;
	Queue<Player> playersQueue = new LinkedList<>();
	HashMap<Integer,Integer> snakes = new HashMap<>();
	HashMap<Integer,Integer> ladders = new HashMap<>();
	
	GameBoard(int boardSize,Queue<Player>playersQueue,HashMap<Integer,Integer>snakes,HashMap<Integer,Integer> ladders){
		this.playersQueue = playersQueue;
		this.snakes = snakes;
		this.ladders = ladders;
		this.boardSize = boardSize;
	}
	
	void start() {
		System.out.println("The Game Begins : ");
		System.out.println("Snakes : "+snakes);
		System.out.println("Ladders :  "+ladders);
		
		while(playersQueue.size()>1) {
			Player currPlayer = playersQueue.poll();
			Dice dice = new Dice();
			int roll = dice.roll();
			
			System.out.println(currPlayer.Name + " Roll : "+roll);
			
			// if the size of the board Exceeds then simply move to the next player
			if(currPlayer.playersPosition + roll > boardSize ) {
				playersQueue.add(currPlayer);
			}
			// if boardsize is reached then simply announce the winner
			else if(currPlayer.playersPosition + roll == boardSize) {
				System.out.println(currPlayer.Name +" won the game ");
				System.out.println("Number of Players Left : "+playersQueue.size());
			}
			else {
				int NextPosition = currPlayer.playersPosition + roll;
				
				// if the next position contains snake or ladder simply move to the snake or ladder index
				if(snakes.containsKey(NextPosition)) {
					int snake_dismissal_position = snakes.get(NextPosition);
					currPlayer.playersPosition = snake_dismissal_position;
					System.out.println(currPlayer.Name +" is at dimeased by snake at "+NextPosition +" and moved to "+snake_dismissal_position);
				}
				
				// if ladder found then upgrade the ladder position
				if(ladders.containsKey(NextPosition)) {
					int ladder_upgrade_position = ladders.get(NextPosition);
					currPlayer.playersPosition = ladder_upgrade_position;
					System.out.println(currPlayer.Name +" got ladder at "+NextPosition+" and upgraded to "+ladder_upgrade_position);
				}
				
				// since not reached the size thus again add to the Queue
				playersQueue.add(currPlayer);
			}
			
		}
		
		System.out.println("Looser : "+playersQueue.poll().Name);
		
	}
	
}
