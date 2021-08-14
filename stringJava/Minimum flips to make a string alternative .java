

package strings;

public class min_flip_binaryTomakeAlternate {
	public static void main(String[]a) {
		String s= "01100100100110";
		int c0=0;
		int c1=0;
		
		for(int i=0;i<s.length();i++) {
			
			
			//if we get 1 at even or 0 at odd then c0++
			// this is basically for 010101010101...(Starting with 0)
			// if pattern doesnot matches with this then increase c0++
			if(i%2==0 && s.charAt(i)=='1') c0++;
			if(i%2!=0 && s.charAt(i)=='0') c0++;
			
			// if we get 0 at even and 1 at odd then c1++
			// this is basically for 1010101010101......(Starting with 1)
			//if pattern does not matches with the term then increase the c1++
			
			if(i%2==0 && s.charAt(i)=='0') c1++;
			if(i%2!=0 && s.charAt(i)=='1') c1++;
			
		}
		
		
		// since we need to find the minimum count, thus get min of these 2
		int ans = Math.min(c0, c1);
		System.out.println(ans);
	}

}
