package tree;
import java.util.Scanner;
public class creation_tree {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the root value : ");
		createTree();
	}
	
	static node createTree() 
	{
		 // root
		int data = scan.nextInt();
		node root = new node(data);
		if(data == -1) return null;
		
		 // left subtree
		System.out.println("Enter the left node value for "+data);
		root.left = createTree();
		
		 // Right subtree
		System.out.println("Enter the right node value for "+data);
		root.right = createTree();
		
		return root;
	}
	
	
	// node
	static class node{ 
		node left;
		node right;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
}

      
/*
 Example :  
     		5
    	  /   \
    	 2     3
       /   \
      4     8
     / \
    6   7
 
Enter the root value : 
5
Enter the left node value for 5
2
Enter the left node value for 2
4
Enter the left node value for 4
6
Enter the left node value for 6
-1
Enter the right node value for 6
-1
Enter the right node value for 4
7
Enter the left node value for 7
-1
Enter the right node value for 7
-1
Enter the right node value for 2
8
Enter the left node value for 8
-1
Enter the right node value for 8
-1
Enter the right node value for 5
3
Enter the left node value for 3
-1
Enter the right node value for 3
-1

  */

