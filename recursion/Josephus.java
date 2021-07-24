package recursion;

public class Josephus {
	public static void main(String[]args) {
		
		int number_of_people= 6;
		int loop_value =3;
		
		System.out.println(jos(number_of_people,loop_value));
		
	}
	
	static int jos(int size,int k) {
		if(size==1) {return 0;}   //0th index i.e first position
		
		return (jos(size-1,k)+k)%size;
		
	}

}
