/*Description: A string is given and returns if the parentheses are equally balanced.
Author: April Randolph
Date: 10/20/2019 , 04/21/20*/

import java.util.Stack;

public class BalancedParentheses {

	private static boolean checkBalancedParentheses(String input){
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for(int i=0; i < input.length(); i++){
			String str = ""+input.charAt(i);		

			if(str.equals("(") || str.equals("[") || str.equals("{")) {
				stack.push(str);
			}

			if(str.equals(")") || str.equals("]") || str.equals("}")) {
				if(stack.isEmpty()) {
					return false;
				}
				String opening = stack.peek();
				if(opening.equals("(") || opening.equals("[") || opening.equals("{")){
					stack.pop();
				}
			}			
		}
		if(input.length() > 0 && stack.isEmpty()){
			isBalanaced = true;
		}

		return isBalanaced;
	}

	public static void main(String[] args) {
		String[] inputs = {"{[()]}","{[(])}","{{[[(())]]}}"};		

		for(String input : inputs){
			System.out.println("Array of braces " + input);
			boolean flag = checkBalancedParentheses(input);
			if(flag){	
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}		
		}
	}
}
