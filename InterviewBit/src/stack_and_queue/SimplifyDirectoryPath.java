package stack_and_queue;
import java.util.*;
public class SimplifyDirectoryPath {

	public static void main(String[] args) {
		String s = "/a/./b/./c/../d/";
		String ans = simplify(s);
		System.out.println(ans);
	}
	
	static String simplify(String s) {
		Deque<String>dq = new LinkedList<>();
		
		for(int i=0;i<s.length();i++) {
			String dir = "";
			
			// ignore the "/" since we dont require to preforn any operation
			while(i<s.length() && s.charAt(i) != '/'  ) {
				dir += s.charAt(i);
				i++;
			}
			
			if(dir.equals("..")) {
				if( dq.size() != 0 )
				     dq.removeLast();
			}
			
			else if(dir.equals(".") || dir.equals("") ) {
				// do nothing
				continue;
			}
			
			// if nothing condition passes that means we found character 
			else dq.addLast(dir);
		}
		
		String ans = "";
		if(dq.size() == 0) return "/";
		
		
		while(dq.size() > 0) {
			ans+= "/" + dq.pollFirst();
		}
		
		return ans;
	}
	

}
