import java.util.*;
import java.io.*;
import java.lang.*;

class ParenthesisBalanced {
    
    public static boolean balanced(String parens) {
        Stack<String> stack = new Stack<String>();
        boolean balanced = false;
        char[] chars= parens.toCharArray();
		int count = 0;
        for(int i = 0; i<chars.length;i++) {
            stack.push(String.valueOf(chars[i]));
        }
        for(int n = 0; n<chars.length;n++) {
			count++;			
            String topParen = stack.peek();
            if((chars[n] == ')' && topParen == "(") ||(chars[n] == '}' && topParen == "{") ||(chars[n] == ']' && topParen == "[") ) {
                stack.pop();
				count--;
            } 
		}
        if(stack.search("(") != -1 && stack.search("[") != -1 && stack.search("{") != -1 && count == 0) {
              balanced = true;
        }
        return balanced;
    }
    
    
	public static void main (String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
		try { 
			input = buffer.readLine();
            boolean parenBalancedValue = balanced(input);
			if(parenBalancedValue) {
				System.out.println("balanced");
			}else {
				System.out.println("not balanced");
			}
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
	}
}