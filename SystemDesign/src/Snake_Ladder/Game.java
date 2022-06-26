package Snake_Ladder;
import java.util.*;
public class Game {
	
	static int BoardSize;
	static HashMap<Integer,Integer>snakes = new HashMap<>();
	static HashMap<Integer,Integer>ladders = new HashMap<>();
	static Queue<Player> players = new LinkedList<>();
	static void initials() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the BoardSize : ");
		BoardSize = scan.nextInt();
		
		System.out.println("Enter the Number of Players ");
		int player_count = scan.nextInt();
		
		int i = 1;
		while(player_count-- > 0) {
			System.out.println("Enter Player "+i+"'s Name ");
			String playerName = scan.next();
			int pos = 1;
			int id = i;
			Player player = new Player(id,playerName,pos);
			players.add(player);
			i++;
		}
		
		System.out.println("Enter the number of snakes ");
		int snake_count = scan.nextInt();
		
		while(snake_count-- > 0) {
			System.out.println("Source ");
			int src = scan.nextInt();
			System.out.println("Destination ");
			int des = scan.nextInt();
			
			
			if(src<0 || src>BoardSize) {
				continue;
			}
			if(des<0 || des>BoardSize || des>src) {
				continue;
			}
			
			snakes.put(src, des);
		}
		
		System.out.println("Enter the number of Ladders ");
		int ladder_count = scan.nextInt();
		
		while(ladder_count-- > 0) {
			System.out.println("Source ");
			int src = scan.nextInt();
			System.out.println("Destination ");
			int des = scan.nextInt();
			
			if(src<0 || src>BoardSize) {
				continue;
			}
			if(des<0 || des>BoardSize || src>des) {
				continue;
			}
			ladders.put(src, des);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		initials();		
		GameBoard game_board = new GameBoard(BoardSize,players,snakes,ladders);
		game_board.start();
		
	}

}
