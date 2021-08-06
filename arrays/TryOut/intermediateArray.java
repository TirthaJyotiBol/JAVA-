// not done -- 1,9,15,16,14

package com.tirtha.TryOut;
import java.util.*;


public class intermediateArray {
    public static void main(String[] args) {
       int[]a={2,5,7,1,3};
       Arrays.sort(a);
       int min = 100;
       int k=3;
       for(int i=0;i<k;i++){
           if(a[k-1]-a[i]<min){
               min = a[k-1]-a[i];
           }
       }
       System.out.println(min);

      }

}

/*
Q.Rain water Trapping problem

    int[]a={3,1,2,4,0,1,3,2};
    int left[]= new int[a.length];
    int right[] = new int[a.length];
      left[0]=a[0];
              right[a.length-1]=a[a.length-1];

              for(int i=1;i< left.length;i++){
        left[i]=Math.max(a[i],left[i-1]);
        }
        for(int i=a.length-2;i>=0;i--){
        right[i]=Math.max(a[i],right[i+1]);
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
        sum = sum+ Math.min(right[i],left[i])-a[i];
        }
        System.out.println(sum);
*/




/*          Q.Moore's Algorithm [element that are repeated in an array with n/k times ; n:-size of array && k:- any arbritary numbers ]

                int[]a={1,1,2,3,4,5,1,2,1,1};
                int firstIndex =0;
                int count =1;
                int c=0;
                int k =a.length/2;
                for(int i=1;i<a.length;i++){
                    if(a[firstIndex]==a[i]){
                        count++;
                    }
                    else{
                        count--;
                    }
                    if(count==0) {
                        firstIndex=i;
                        count++;
                    }
                }

                for(int j=0;j<a.length;j++){
                    if(a[firstIndex]==a[j]){
                        c++;
                    }
                }
                if(c>=k){
                    System.out.println("yes it is there and the number is : "+a[firstIndex]+" which is repeated "+ c+" times");
                }
                else System.out.println("no");
       */



/*     Find minimum element in sorted and rotated Array


 int[]a={23,76,123,542,9,10,14,21};
                System.out.println(binarySearch(a,0,a.length-1));
            }
    static int binarySearch(int[]a,int low,int high) {
        int mid = (low + high) / 2;
        if (a[low] < a[high]) return a[low];
        while (low <= high) {
            if ((a[mid] < a[mid + 1]) && (a[mid] < a[mid - 1])) {
                return a[mid];
            }
            if (a[mid] > a[low]) {
                if ((a[mid] < a[mid + 1]) && (a[mid] < a[mid - 1])) {
                    return binarySearch(a, 0, mid - 1);
                } else {
                    return binarySearch(a, mid + 1, high);
                }
            }
            if (a[mid] < a[low]) {
                if ((a[mid] < a[mid + 1]) && (a[mid] < a[mid - 1])) {
                    return binarySearch(a, mid + 1, high);
                } else {
                    return binarySearch(a, 0, mid - 1);
                }
            }

        }
        return a[mid];
  */








/* Q12. ZERO sum subarray :[if the array is having subarrays whose sum is equal to 0]

   int[]a={1,2,2,5,3,4,1,-2,2};
        boolean isThere =false;

        for(int i=0;i<a.length;i++){
            int sum=a[i];
            for(int j=i+1;j<a.length;j++){
                sum=sum+a[j];
                if(sum==0){
                    isThere =true;
                }
            }
        }
        if(isThere){
            System.out.println("yes");
        }
        if(!isThere){
            System.out.println("no");
        }
  */


 /* Q11. Set elements in an array in an alternating manner [one positive and one negative]

  System.out.println("Rearrange the positive and negative in an alternating manner");
        int[]a={1,2,2,1,-2,-9,-8,-6};
        int[]c=new int[a.length];

        int p=0; int n=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                c[p]=a[i];
                p=p+2;
            }
            if(a[i]<0){
                c[n]=a[i];
                n=n+2;
            }
        }
        for(int j:c){
            System.out.print(j+" ");
        }

*/


    /* Q. Program to find the index of first duplicate element in an array

       System.out.println("Program to find the first duplicate element index");
        int[]a={1,2,3,4,3,3};
        int count=0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i] == a[j]) {
                    System.out.println(i+" is the index of the element " + a[i]);
                    count++;
                }
                while (count ==1) return;


                }


            }

 */




/*  Q. Find common elements between three sorted arrays

 System.out.println("common elements betweem three sorted arrays");
        int[]a={1,2,3,4};
        int[]b={2,3,4,5};
        int[]c={3,7,8,9,1,2};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++){
                    if((a[i]==b[j]) && (a[i]==c[k])){
                        System.out.println(a[i]);
                    }
                }
            }
        }



   */





/*   Q. quick sort algorithm

        System.out.println("Quick Sort Sorting");
        int a[]={13,2,4,11,7,22,3,1};
        int len=a.length-1;
        intermediateArray qs = new intermediateArray();
        qs.quickSort(a,0,len);
        qs.printArray(a);
    }

        int quickSortMiddle(int[]a,int low,int high){
            int pivot = a[(low+high)/2];
            while(low<high){
                while (a[low]<pivot){ low++; }
                while(a[high]>pivot){high--;}
                if(low<=high){
                    int temp =a[low];
                    a[low]=a[high];
                    a[high]=temp;
                    low++;
                    high--;
                }
            }
            return low;
        }

       void quickSort(int[]a,int low ,int high){
           int mid = quickSortMiddle(a,low,high);
           if(low<mid){ quickSort(a,low,mid-1); }
           if(low>mid){quickSort(a,mid,high);}
       }

    void printArray(int[]arr){
        for(int i:arr){System.out.print(i+" ");}

*/




/*

  Q. Find the duplicate elements in an Array public static void main(String[] args) {

        int[]a={1,2,3,4,1,2,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                   System.out.println(a[i]);
                }
            }        }


  */




/* Q. find the number of pairs of elements whose sum is equal to the total sum given

    System.out.println("find all the pairs of integer whose sum is equal to the  given number ");
        int given = 6;
        int []a={1,5,7,1};
        int number = 6;
        int count =0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                sum =a[i]+a[j];
                if(sum==number){
                    count++;
                }

            }
        }
        System.out.println(count);
  */


/*  Q. find the missing Number in an array


 int n=14; //let us assume that it to take for first " n=14 " natural number .
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14};
        int SumOfFirstN = (n*(n+1))/2;
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        int missingNumber = SumOfFirstN - sum;
        System.out.println("The missing number is "+ missingNumber);
   */




/* Q.Cyllindrically rotate an element by one

 System.out.println("cyllindrically rotate elements in array by one");
        int[]a={1,2,3,4,5};
        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        for(int s:a){
            System.out.print(s+" ");
        }
*/