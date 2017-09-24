import java.io.*;
import java.util.*;

public class  BinaryTest {
    
    static String[] inputValues;
    
    public static String getNumberSum(String input1, String input2) {
        /* Recursive call for sum operation */
        int number1 = Integer.parseInt(input1, 2);
        int number2 = Integer.parseInt(input2, 2);
        
        return Integer.toBinaryString(number1 + number2);
    }
    
    public static String NumberParser(String x) {
        String result;
        String num1;
        String num2;
        
        if(x.contains(" ") && (x.length() >= 3)) {
            inputValues = x.split(" ");
            num1 = inputValues[0];
            num2 = inputValues[1];
        }
        System.out.println("The numbers that you entered are " + num1.toString() + " and " + num2.toString());
        
        result = getNumberSum(num1, num2);
        return result;
    }


    public static void main(String[] args) throws IOException {
          BinaryTest bn = new BinaryTest();
          inputValues = new ArrayList<String>();
                  
          try { 
              String x;
              
              int index = 0;
              System.out.println("Please enter two binary numbers seperated by a space to get the sum: ");
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
              if((x = br.readLine()) != null) {
                  index++;
                  String output = NumberParser(x);
                  System.out.println("The sum of those two numbers is " + output.toString());
                }
          } catch (IOException e) {
    			System.out.println("An IoException has occurred " + e.toString());
    	  } catch (Exception e) {
    			System.out.println("An Exception has occurred " + e.toString());
    	  }	
    }
}
