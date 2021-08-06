package com.tirtha.TryOut;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);





    }}

//
// System.out.println(c.length);
//        for(int i=0;i<a.length;i++){
//            c[i]=a[i];
//        }
//        for(int i=0;i<b.length;i++){
//            c[i+a.length]=b[i];
//        }
//
//
//
//       for(int i=0;i<c.length-1;i++) {
//       for(int j=0;j<c.length-1;j++){
//           if(a[i]>a[i+1]){
//               int temp=a[i];
//               a[i]=a[j];
//               a[j]=temp;
//           }
//       }
//       }
//        System.out.println();
//        for (int pp:c){
//            System.out.print(pp+" ");
//        }
//













//Easy


/* Q. move the negative elements at one side of the array

 System.out.println("put the negative elements at one side of the array");
        int[]a ={0,0,44,22,45,-1,-2,-2,-6};
        int temp;
        System.out.println();
        for (int i=0;i<a.length;i++){
            for(int j =i;j<a.length;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
            for(int p:a){
                System.out.print(p+" ");
            }


 */


/*
  Q.Finding the range of the array  --> range = largest element - smallest element

  System.out.println("Find the range of an Array ");
        int []a ={2,3,4,5,6,1};
        int max=a[0],min=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        int range = max - min;
        System.out.println("the range of the array is "+range );
 */

/* Q. Sort an array of elements without using any sorting technique

 System.out.println("Sort an array without any sorting algorithm ");
        int a[] ={1,1,1,2,1,2,0,0,0,1,2,2};
        int c0=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) c0++;
            if(a[i]==1)c1++;
            if(a[i]==2)c2++;
        }
        for(int na:a) {System.out.print(na+" ");}

        int []newArray = new int[a.length];

        for(int i=0;i<c0;i++){
            newArray[i]=0;
        }
        for(int i=c0;i<c1+c0;i++){
            newArray[i]=1;
        }
        for(int i=c1+c0;i<newArray.length;i++){
            newArray[i]=2;
        }
        System.out.println();
        System.out.println();

        for(int na:newArray){
            System.out.print(na+" ");
        }
  */


/* Q. find the frequency of an element in the array

System.out.println("frequency of an element");
        System.out.println("enter the value of k");
        int []a = {1,2,3,1,2,3,2,2,2};
        int find = sc.nextInt();
        int count=0;
        int i=a.length-1;
        while(i>=0)
        {
            if(a[i]==find){
                count++;
            }
        i--;
        }

        System.out.println("the number of times "+find +" is repeated is  "+count);
          */

/* Q. kth largest and smallest

System.out.println("find Kth largest and smallest element");
        System.out.println("The original array is ");
        int[]a ={5,2,7,3,88,4,353,7575};
        for(int ori:a){
            System.out.print(ori+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println("The sorted array is :");
        for(int sor:a){
            System.out.print(sor+" ");
        }
        System.out.println();

        System.out.println("Enter the value of k");
        int k =sc.nextInt();
       System.out.println("The "+k+" largest element is : "+a[a.length-k]);
       System.out.println("The "+k+" smallest element is "+ a[k-1] );

  */



/* Q.sort an array

 System.out.println("sort an array");  //bubble sort is used here
        int[]a ={4,2,87,6,0,55,33,1};
        int temp;
        System.out.println("the old array is : ");
        for(int old:a){
            System.out.print(old+" ");
        }
        System.out.println();
        for (int i=0;i<a.length;i++){
            for(int j =i;j<a.length;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("the Sorted array is");
        for(int sa: a){
            System.out.print(sa+" ");
        }

 */


/*

  Q. reverse an array

  System.out.println("program to reverse the array");
        int[]a ={1,2,3,4,5,6};
        int start=0,end=a.length-1;
        int temp;
        System.out.println("The original array is :  ");

        for(int old: a){
            System.out.print(old+" ");
        }

        while (start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

        System.out.println();
        System.out.println("The new array is : ");

        for(int newa: a){
            System.out.print(newa+" ");
        }
 */




/*
Q. Take inputs from user and print them

        int array[] = new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements in the array");
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt() ;
        }
        for(int a:array){
            System.out.println(a+" ");
        }
*/



/*
Q. To find if any element is present in an array or not

  boolean isFound = false;
        System.out.println("check whether the number is present in an array or not");
        System.out.println("Enter the element you want to search");
        int search = sc.nextInt();
        int [] array = {1,3,5,2,5,2};
        for(int i=0;i<array.length;i++){
            if(array[i]==search){
                isFound=true;
                break;
            }
            else{
                isFound = false;
                break;
            }



        }
        if(isFound) System.out.println("the element is found");
        else System.out.println("the element is not found");
 */



/*
 Q. Find the minimum and maximum element is an array

System.out.println("To find the minimum and maximum element in array");
        int[]a = {11,2,3,4,5,6,7,433,423,0,87};
        int  min = a[0];; int max=a[0]; int temp;
        for(int i=1;i<a.length;i++){
                if(a[i]<min){
                    min=a[i];
                }
                if(a[i]>max){
                    max=a[i];
                }

        }
        System.out.println("the minimum element is " + min);
        System.out.println("the maximum element is " + max);




 */




