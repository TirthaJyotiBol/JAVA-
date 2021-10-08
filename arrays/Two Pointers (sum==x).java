

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int[]a={9,8,7,6,-54,4,-2,0,-1};
        Arrays.sort(a);                                           //sort the array
        int k=-56;
        if(isThere(a,k)){
            System.out.println("Yes there is a subarray of 2 numbers whose sum is "+ k);
        }
        else{System.out.println("No there is no such subarray");}
     
    }
    static boolean isThere(int[]a,int k){
        int i=0;
        int j=a.length-1;
      
        
        while(i<j){                                               // run the loop for i<j
        if(a[i]+a[j]>k){j--;}
        else if(a[i]+a[j]<k){i++;}                                // conditions for the sum==x
        else return true;
        }
        return false;
     
    }
}
