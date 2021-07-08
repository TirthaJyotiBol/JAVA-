import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int[]a={2,3,1,9,8,6,5,-1,-1,9};                         if(a[i] = - sum) then elements are  present  ;
        boolean check= false;                                      else not present;
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
             int k=-a[i];
             
             if(isThere(a,k,i+1)){check=true;  break;}
             else{check=false;}
        
        }
       
       if(check){System.out.println("True");}
       else{System.out.println("No");}
       
    }
    static boolean isThere(int[]a,int k,int i){                  // function for 2 sum elements 
        int j=a.length-1;
        
        while(i<=j){
        if(a[i]+a[j]>k){j--;}
        else if(a[i]+a[j]<k){i++;}
        else return true;
        }
        return false;
     
    }
}
