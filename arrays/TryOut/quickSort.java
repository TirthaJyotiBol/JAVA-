package com.tirtha.TryOut;

public class quickSort
{
    public static void main(String[]args)
    {
        int[]a={1,2,3,-9,-8,0,-5};
        int length =a.length-1;
        quickSort qs =new quickSort();
        qs.sorting(a,0,length);
        qs.print(a);

    }
    int partition(int[]a,int low,int high){
        int pivot = a[(low+high)/2];
        while(low<=high)
        {
            while(a[low]<pivot){low++;}
            while(a[high]>pivot){high--;}
            if(low<=high)
            {
                int temp =a[low];
                a[low]=a[high];
                a[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void sorting(int[]a,int low ,int high){
        int middle =  partition(a,low,high);
        if(low<middle-1){ sorting(a,low,middle-1); }
        if(middle<high){sorting(a,middle,high);}
    }
    void print(int[]a){
        for(int i:a){
            System.out.print(i+" ");
        }
    }


    }
