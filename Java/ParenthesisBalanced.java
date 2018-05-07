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
			count++;
        }
        for(int n = 0; n<chars.length;n++) {
            String topParen = stack.peek();
            if((topParen.equals(")") && chars[n] == '(') ||(topParen.equals("}") && chars[n] == '{') ||(topParen.equals("]") && chars[n] == '[')) {
                stack.pop();
				stack.pop();
				count = count-2;
				if(count == 0) {
					break;
				}
            } 
		}
        if(stack.empty()) {
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