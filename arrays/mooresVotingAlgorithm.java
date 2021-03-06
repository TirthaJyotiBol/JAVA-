MOORES VOTING ALGORITHM "OR" maximum element in an array "OR" element that repeats n/k times in the array :

=>

@ MOORE'S ALGORITHM : time-> o(n) Space -> o(1)
/**
ALGORITHM:
#traverse the array once 
#take majorityIndex 0 as the majority element index
#compare this with other elements  by taking index =1;
#if matched then increase the count
#else decrease the count
#if the count ==0 then take ansIndex = i 
#a[index] is the mostly repeated element in the array
#if the count of a[i]>n/2 then this is the element 
 else there is no such element
**/


class MooresAlgorithm {
    public static void main(String[] args) {
        int[]a={1,2,2,1};
        int ansIndex = 0;
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[ansIndex]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansIndex = i;
                count++;
            }
        }
        
        /* count is found now check how many times the number is repeated un the array
           if its greates than n/2 then it is our number else there is no such number 
        */
        
        int c=0;  //count of a[ansIndex}
        
        for(int i=0;i<a.length;i++){
            if(a[ansIndex]==a[i]){
                c++;
            }
        }
            if(c>a.length/2){
                System.out.println("The majority number is "+ a[ansIndex]);
            }
            else{
                System.out.println("there is no such element");
            }
        
    }
}






@BruteForce Method: space->o(1)  Time->o(n^2)

ALGORITHM:
#Find the frequency of each element and compare freq with maxCount
#if freq > maxcount then the most repeated element is in the index of max count
#if (maxCount>n/2) => print the index of teh element

class mooersAlgorithm {
    public static void main(String[] args) {
     int[]a={1,2,3,2,2,2};
     int maxcount=0;
     int index =0;
     for(int i=0;i<a.length;i++){
         int count =0;
         for(int j=1;j<a.length;j++){
             if(a[i]==a[j]){
                 count++;
             }
             if(count>maxcount){
                 maxcount=count;
                 index = i;
             }
         }
     }
     if(maxcount>(a.length)/2){
         System.out.println("the maximum element is " + a[index]);
     }
     else{
         System.out.println("There is no such element");
     }
    }
}



@ A bit optimised : Time-> o(nlogn)  space ->o(1)

ALGORITHM:
#sort the array
#compare the adjacent elements and increase the count if equal found
#count ==1 if not equal
#if (count>maxvount) -> maxcount=count
#finally check if maxcount>n/2 { if yes then print a[index] , else print "no elements"}


class aBitOptimised {
    public static void main(String[] args) {
       int[]a={1,2,3,4,4,4,4};                // sorted array is taken
       int maxcount =0;
       int count=1;
       int index=0;
       for(int i=0;i<a.length-1;i++){     
           if(a[i]==a[i+1]){                // if adjacent elements are equal then increase the count
               count++;
           }
           else{
               count =1;                   // if adjacent elements are not found then decrease make count =1 (or count=1 , as your wish)
           }
            if(count>maxcount){
               maxcount=count;
                index=i;                   // index of the most repeated element
       }
          
           }
           System.out.println(maxcount);
           if(maxcount>a.length/2){
               System.out.println("The maximum element is "+ a[index]);     // if the max element is > n/2 then yes its the majority element
           }
           else{
               System.out.println("Threr is no such element");
           }
           
       
    }
}


