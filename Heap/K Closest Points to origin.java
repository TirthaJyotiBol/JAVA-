/*
  Find the K closest point to distance
  
  Class Triplet contains points and the distance b/w then 
    dist = Math.sqrt( (x-x1)^2 + (y-y1)^2 )
    
    Here x1,y1 = 0 ( origin )
    thus formulae => Math.sqrt(x^2 + y^2)
    
    
    * Since we need closest point thus we use Max Heap -> to element the Larger distance
    * Max Heap Sorts on the basis of distance
    * After k operations return the elements in the heap
 
 */

package Heap;
import java.util.*;
public class K_closestPoint_to_origin {

	public static void main(String[] args) {
		int[][]a = { {1,3} , {-2,2} , {5,8} , {0,1}, {2,0} };
		
		fun(a,3);
		
	}
	
	static void fun(int[][]a,int k) {
		
		if(k>a.length) {
			System.out.println(-1);
			return;
		}
		
		PriorityQueue<Triplet>pq = new PriorityQueue<>(Collections.reverseOrder());	// used Max Heap
		for(int i=0;i<k;i++) {
			int x = a[i][0] * a[i][0];
			int y = a[i][1] * a[i][1];
			int ta = x + y;
			double d = Math.sqrt(ta);
			pq.add(new Triplet(a[i][0],a[i][1],d));
		}
		
		
		for(int i=k;i<a.length;i++) {
			int x = a[i][0] * a[i][0];
			int y = a[i][1] * a[i][1];
			int ta = x + y;
			double d = Math.sqrt(ta);
			
			if(d < pq.peek().dist) {
				pq.poll();
				pq.add(new Triplet(a[i][0],a[i][1],d));
			}
		}
		
		while(pq.isEmpty() == false) {
			System.out.println(pq.peek().a+" "+pq.peek().b +" -> "+pq.peek().dist);
			pq.poll();
		}
		
	}
	
	static class Triplet implements Comparable<Triplet>{
		int a;
		int b;
		double dist;
		
		Triplet(int a,int b,double dist){
			this.a = a;
			this.b = b;
			this.dist = dist;
		}

		@Override
		public int compareTo(Triplet o) {
			if(dist<o.dist) return -1;
			return 1;
		}
	}

}
