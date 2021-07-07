import java.util.*;


public class rainWater {
    public static void main(String[] args) {
      int[]a={3,1,2,4,0,1,3,2};                          //Declared the array
      
      int left[]= new int[a.length];                      // Declared 2 auxiliary array -> left and right
      int right[] = new int[a.length];
      
      left[0]=a[0];                                      
      right[a.length-1]=a[a.length-1];

      for(int i=1;i< left.length;i++){                     // preprocessing left[] and right[] with the maximum element
          left[i]=Math.max(a[i],left[i-1]);
      }
      
      for(int i=a.length-2;i>=0;i--){
          right[i]=Math.max(a[i],right[i+1]);
      }
      
      int sum=0;
      for(int i=0;i<a.length;i++){                                     // formulae -> i = Math.min(left[i],right[i])-a[i]
          sum = sum+ Math.min(right[i],left[i])-a[i];                  // sum is calculated 
      }
      
      System.out.println(sum);                       
    }

}
