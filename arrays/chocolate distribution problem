package trial;
import java.util.*;

public class cdp {
	public static void main(String[]args) {
		int[]a= {7, 3, 2, 4, 9, 12, 56};
		Arrays.sort(a);
		int m=5;                                                          // for 5 students
    
		int min=Integer.MAX_VALUE;            
    
		if(m>a.length-1) {System.out.println("Invalid");}
		
    else {
		for(int i=0;i<=a.length-m;i++) 
		{
			if(a[m-1+i]-a[i]<min)
			{
				min = a[m-1+i]-a[i];
			}
		}
		System.out.println(min);
		}
	}
}
