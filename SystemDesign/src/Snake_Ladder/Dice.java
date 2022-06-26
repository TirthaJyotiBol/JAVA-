package Snake_Ladder;

public class Dice {
	int roll() {
		int min = 1;
		int max = 6;
		int range = min + (int)(Math.random()*((max-min)+1));
		return range;
	}
	
	public static void main(String[]args) {
		Dice d = new Dice();
		System.out.print(d.roll());
	}
}
