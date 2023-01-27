import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.lang.*;

class WellFormedParenthesisCountInString {
    public static int longestValidParentheses(String s) {
        Queue<Integer> queue = new LinkedList();
        Stack<String> stack = new Stack<>();
        int sInPush = 0;
        int count = 0;
        int in = 0;
        int out = 0;
        for(int i = 0;i<s.length();i++) {
            if(String.valueOf(s.charAt(i)).equals("(")) {
                queue.add(in++);
            } else if(String.valueOf(s.charAt(i)).equals(")")) {
                queue.add(out--);
            }
        }
        for(int i = 0;i<s.length();i++) {
          
            if(String.valueOf(s.charAt(i)).equals("(")) {
                stack.push(String.valueOf(s.charAt(i)));
                sInPush++;
            } 
            if(String.valueOf(s.charAt(i)).equals(")") && stack.contains("(") && sInPush > 0 && ((s.length() + queue.poll() + in - i) > -1)) {
                stack.pop();
                sInPush--;
                count = count + 2;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		String parens = ")()()(()))";
		System.out.println("Valid parenthesis for " + parens + " " + longestValidParentheses(parens)); 
	}
}
