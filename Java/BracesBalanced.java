import java.util.*;
import java.lang.*;

public class BracesBalanced {

	static String[] braces(String[] values) {
        int n = values.length-1;
        String[] returnArray = new String[n];
        Stack<String> stack = new Stack<String>();
       
        if(n==0 || n==1) {
            returnArray = new String[2];
            returnArray[1] = "NO";
            return returnArray;
        }
        for(int i = 0;i<=n;i++) {
            System.out.println("Debug: " + values[i] + " length " + n);
            if(values[i] == "{" || values[i] == "[" || values[i] == "(") {
                stack.push(values[i]);
            }
            if(values[i]== "}" || values[i] == "]" || values[i] == ")") {
                if(stack.empty()) {
                    returnArray[1] = "NO";
                    return returnArray;
                }
                String place = stack.peek();
                if(place.equals("{") ||place.equals("[") || place.equals("(") ) {
					stack.pop();
                }
            }
        }    
                    System.out.println(" n " + n + " " + stack.empty());
        if(n>0 && stack.isEmpty()) {
            returnArray[0] = "YES";
            return returnArray;
        }
        return returnArray;
    }

	public static void main(String[] args) {
		String[] array = new String[4];
		array[0] = "(";
		array[1] = "[";
		array[2] = ")";
		array[3] = "]";
		String[] balancedValues = braces(array);
		for(int i = 0;i<balancedValues.length;i++) {
			System.out.println(balancedValues[i]);
		}
	}
}
