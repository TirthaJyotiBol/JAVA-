package trie;

public class Insert_search {

	public static void main(String[] args) {
		Node root = new Node();
		Insert("Tirtha",root);
		Insert("Jyoti",root);
		Insert("russia",root);
		boolean isPresent = search("Jyoti",root);
		System.out.println(isPresent);
	}
	
	static class Node{
		boolean isEnd;
		Node[]child = new Node[26];
	}
	
	static void Insert(String s,Node r) {
		Node root = r;
		for(int i=0;i<s.length();i++) {
			int index = Math.abs(s.charAt(i) - 'a');
			if(root.child[index] == null) {
				root.child[index] = new Node();
			}
			root = root.child[index];
		}
		root.isEnd = true;
	}
	
	static boolean search(String s,Node root) {
	
		Node curr = root;
		for(int i=0;i<s.length();i++) {
			int index = Math.abs(s.charAt(i) - 'a');
			if(curr.child[index] == null) return false;
			
			curr = curr.child[index];
		}
		return curr.isEnd;
	}

}
