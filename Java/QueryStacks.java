import java.util.*;
import java.lang.*;

public class QueryStacks {

	static Stack stackOutput(String queriesStr, int length) {
		Stack res = new Stack();
		Queue queue = new PriorityQueue();
		for(int k = 0;k<queriesStr.length();k++) {
			if(Integer.valueOf(queriesStr.charAt(k)) == 1) {
				queue.add(queriesStr.charAt(k+1));
			} else if(Integer.valueOf(queriesStr.charAt(k)) == 2) {
				res.push(queue.remove());
			}
		}
		if(queue.peek()==null) {
			while(res.empty() == false) {
				res.pop();
			}
			res.push(-1);
			return res;
		} else {
			return res;
		}
	}	

	static void printStack(Stack print) {
		while(print.empty() != true) {
			System.out.println(print.pop());
		}
	}
	
	public static void main(String[] args) {
		int len = 4;
		String input = "141922";
		printStack(stackOutput(input, len));	
	}
}
