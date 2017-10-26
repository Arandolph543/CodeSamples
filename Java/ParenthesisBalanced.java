import java.util.*;
import java.lang.*;
import java.io.*;

class ParenthesisBalanced {
    
    public static boolean balanced(String parens) {
        Stack<String> stack = new Stack<String>();
        boolean balanced = false;
        char[] chars= parens.toCharArray();
		int count = 0;
        for(int i = 0; i<chars.length;i++) {
            stack.push(String.valueOf(chars[i]));
			count++;			
            String topParen = stack.peek();
            if((chars[i] == ')' && topParen == "(") ||(chars[i] == '}' && topParen == "{") ||(chars[i] == ']' && topParen == "[") ) {
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
		String parenthesis = "({[})";
		ParenthesisBalanced gfg = new ParenthesisBalanced();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int distributions = 0;
        boolean[] operations = null;
        try { 
            distributions = Integer.parseInt(buffer.readLine());
            operations = new boolean[distributions];
            String[] parenthesis = new String[distributions];
            String input = "";
            for(int i = 0; i< distributions;i++) {
                input = buffer.readLine();
                parenthesis[i] = input;
                operations[i] = gfg.balanced(parenthesis[i]);
            }  
            for(int d = 0;d<operations.length;d++) {
				if(operations[d]) {
        		    System.out.println("balanced");
        		}else {
        		    System.out.println("not balanced");
        		}
			}
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
	}
}