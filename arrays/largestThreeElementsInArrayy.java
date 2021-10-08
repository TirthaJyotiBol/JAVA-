/* Q10. Given an array with all distinct elements, find the largest three elements.
 Expected time complexity is O(n) and extra space is O(1).
Input: arr[] = {10, 4, 3, 50, 23, 90}   Output: 90, 50, 23
*/


public class intermediateArray {
    public static void main(String[] args) {
       int a[]={10, 4, 3, 50, 23, 90};
       intermediateArray p = new intermediateArray();
       p.algo(a,0,a.length-1);
       p.print(a);
        System.out.println();
       System.out.println("The largest three elements are :");
       for(int i=a.length-3;i<a.length;i++){
           System.out.print(a[i]+" ");
       }

    }
    int partition(int[]a,int low,int high){
        int pivot=a[(low+high)/2];
        while(low<=high) {
            while (a[low] < pivot) {
                low++;
            }
            while (a[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void algo(int a[],int low,int high){
        int mid = partition(a,low,high);
        if(low<mid-1){algo(a,0,mid-1);}
        if(mid<high){algo(a,mid,high);}
    }
    void print(int[]a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
