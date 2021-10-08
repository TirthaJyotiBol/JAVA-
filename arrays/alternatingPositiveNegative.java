
/*
Q.11 Rearrange the array in alternating positive and negative items with O(1) extra space.


First method is to take a space - here another array "c" is being taken and the elements are there transferred
 
code :
*/
public class intermediateArray {
    public static void main(String[] args) {
        System.out.println("Rearrange the positive and negative in an alternating manner");
        int[]a={1,2,2,1,-2,-9,-8,-6};        // declare the array ;
        int[]c=new int[a.length];            // initialize another array with the same size of the first array;

        int p=0; int n=1;                    // p is for positive numbers and n is for negative numbers
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                c[p]=a[i];                   // if the value is positive it is inserted into the new array with index starting from 0 and increment in an even way
                p=p+2;
            }
            if(a[i]<0){
                c[n]=a[i];                 // if the element is negative it is inserted into the array with index starting from 1 and increment in odd manner
                n=n+2;
            }
        }
        for(int j:c){
            System.out.print(j+" ");      // print the new array
        }

    }

}



// INPUT --   1 2 3 4 -1 -2 -3 -4 
// OUTPUT --  1 -1 2 -2 3 -3 4 -4




/*Second method is to perform through O(1) i.e. constant space 
Firstly the elements are arranged in ascending order such that all +ve elements comes to one side and all -ve elements goes to the other side
start two pointers from start and last and swap the alternating positive and negative elements until low>=high

code : 
*/


  class GFG {
            public static void main (String[] args) 
             {
                int[]a={1,6,3,-67,9,-8,-2,-87};         // declare the array
                int high =a.length-1;
                GFG qs = new GFG();                     // sort the array using QUICKSORT algorithm; 
                qs.recursion(a,0,high);
                int i=0,j=a.length-1;                    // initialize 2 pointers i(0) and j(a.length-1) ;
                while(i<=j)
               {                                         // until i<=j swap the alternating elements
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i=i+2;                               // alternating is decided through i=i+2  && j=j+2;
                    j=j-2;
                }
                qs.print(a);

            }
            int partition(int[]a,int low,int high){         //QUICKSORT ;
                int pivot =a[(low+high)/2];
                while(low<=high){
                    while(a[low]<pivot){low++;}
                    while(a[high]>pivot){high--;}
                    if(low<=high){
                        int temp=a[low];
                        a[low]=a[high];
                        a[high]=temp;
                        low++;
                        high--;
                    }
                }
                return low;
            }
            void recursion(int[]a,int low,int high){
                int mid = partition(a,low,high);
                if(low<mid-1){recursion(a,low,mid-1);}
                if(high>mid){recursion(a,mid,high);}
            }
            void print(int[]a){                            //Method to print array;
                for(int g:a){
                    System.out.print(g+" ");
                }
            }
        }
