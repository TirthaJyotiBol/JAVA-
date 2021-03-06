Q17 Minimum element in rotated and Sorted array 


<Anuj Bhaiya>
-------------
Approach 1:

Algorithm:
*Since the array is sorted and we know the upper and lower index so it is good for us to go with BINARY Search.
*Condition for smallest element --> a[mid]<a[mid-1]  && a[mid]<a[mid+1]  i.e. the "mid" element is less than its previous and next value.
*if a[low]<a[mid] => the lower part of the array is sorted (0->mid)
*if the minimum element condition satisfies at that place then search for the element at that place
*if the minimum condition doesnot satisfies then search for the element at the upper bound (mid+1 -> high)
*do the same for the upper part of the array

code=>
...........
public class intermediateArray
      {
            public static void main (String[] args)
            {
                int[]a={23,76,123,542,9,10,14,21};
                System.out.println(binarySearch(a,0,a.length-1));
            }
    static int binarySearch(int[]a,int low,int high) {              //Binary Search is used
         
        if((low==high || a[low]<a[high]))          // if only 1 element is present or if the array is sorted then return the first element 
           {
               return a[low];
          }
         
        int mid = (low + high) / 2;
        if (a[low] < a[high]) return a[low];
        while (low <= high) {
            if ((a[mid] < a[mid + 1]) && (a[mid] < a[mid - 1]))    // checks the middle element : if mid element is lesser than previous and next then this mid element is the smallest one
               {
                return a[mid];
            }
            if (a[mid] > a[low]) {                                       // this condition means that the lower part of the array is sorted
                if ((a[mid] < a[mid + 1]) && (a[mid] < a[mid - 1])) {    // if the minimum element condition satisfies at that place then search the minimum element at 0 -> mid-1
                    return binarySearch(a, 0, mid - 1);
                } else {
                    return binarySearch(a, mid + 1, high);    //  if the minimum condition is not satisfied at that place then search the element from mid+1 ->high 
                }
            }
            if (a[mid] < a[low]) {
                if ((a[mid] < a[mid + 1]) && (a[mid] < a[mid - 1])) {     // this is the condition for upper part of array being sorted 
                    return binarySearch(a, mid + 1, high);               // if the minimum element is found at that place then search there in mid=1->high
                } else {
                    return binarySearch(a, 0, mid - 1);               //if that element is not found at lower place then search in the lower bound from 0->mid-1
                }
            }

        }
        return a[mid];
    }
  }


<After Achademy>

Approach 2:
code=>

public class HelloWorld{

     public static void main(String []args)
  {
        int[]a={8,9,10,11,12,6,7};
        System.out.println(binarySearch(a,0,a.length-1));
   
  }
     static int binarySearch(int[]a,int low,int high)
       {

         int mid=(low+high)/2;

         if(a[low]<a[high] || low==high) return a[low];       // if only 1 element present or if array is sorted then return the element at low index
         while(low<=high)
         {
         if((a[mid]<a[mid+1]) && (a[mid]<a[mid-1])){          // if mid is the smallest element then return mid
             return a[mid];
         }
         if(a[mid]>a[low])
         {
           return  binarySearch(a,mid+1,high);
         }
         else{
            return binarySearch(a,low,mid);
         }
         
     }
         return a[mid];
     }
}
