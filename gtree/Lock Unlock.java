package gtree;
import java.util.*;
public class Lock_Unlock {

	public static void main(String[] args) {

	}
	
	class Node{
		int data;
		boolean isLock;
		boolean isLockable;
		Node parent;
		ArrayList<Node>arr;
		Node(){
			isLock = false;
			isLockable = false;
			arr = new ArrayList<>();
		}
		
		Node(Node parent){
			this.parent = parent;
		}
	}
	
	boolean isLocked(Node node) {
		return node.isLock;
	}
	
	boolean lock(Node parent) {
		if(parent.isLockable == false) return false;
		
		// check if any of the anscestor is locked
		Node temp = parent;
		boolean is_anscester_locked = false;
		while(temp!=null) {
			if(temp.isLock == true) {
				is_anscester_locked = true;
				break;
			}
			temp = temp.parent;
		}
		
		// if anscestor is locked then we cannot lock 
		if(is_anscester_locked == true) {
			return false;
		}
		
		// if we found that it can be locked then lock this and update all the anscestors to non lockable
		if(is_anscester_locked==false) {
			temp = parent;
			temp.isLock = true;
			while(temp!=null) {
				temp.isLockable = false;
				temp = temp.parent;
			}
		}	
		return true;
	}
	
	// unlock and update all the ancestors as lockable
	
	boolean unlock(Node parent) {
		if(parent.isLock == false) return false;
		parent.isLock = false;
		Node temp = parent;
		while(temp.parent!=null) {
			temp.isLockable = true;
			temp = temp.parent;
		}
		return true;
	}
}
