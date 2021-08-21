/*
		Given an array -> find if the position of the element equals to the element
		ALGO->
		   1. Travese the whole Array , find if the current element equals to the current position
		   2. If found them add them into List

*/


package Search_and_sorting;
import java.util.*;
public class Value_Equal_index {

	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<>();
		int a[]= {11,21,54,4,5,6,7,87};
		for(int i=0;i<a.length;i++) {
			if(a[i]==i+1) {
				list.add(a[i]);
			}
		}

		System.out.println(list);
	}

}
