// Print the element in Nth Row Mth Col

/*
 
 Nth row and Mth col is given by => 
 
 (n-1)C(m-1)
 
 e.g. 7C4 =>
 
      7 * 6 * 5 * 4
      -------------
      4 * 3 * 2 * 1
      
    In the numerator the number of elements should be equal to the number of column elements ( this is an optimised form of nCr)
  
 */
package Arrays;
public class PascalTriangle_nthRow_mthCol {

	public static void main(String[] args) {
		print(7,4);
	}
	
	static void print(int n,int m) {
		
	  m = m - 1;
	  n = n - 1;
	  int temp = m;
	  
	  int den = 1;
	  while(m > 0) {
		  den = den * m;
		  m--;
	  }
	  
	  int num = 1;
	  int i = 1;
	 
	  while( i<= temp) {
		  num = num * n;
		  n--;
		  i++;
	  }
	  
		System.out.println(num / den);
	}

}
