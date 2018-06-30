import java.util.*;
import java.text.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    int n = String.valueOf(payment).length();
    StringBuilder stringBuilder = new StringBuilder();
    String us = String.format("$%(,.2f",
                payment);
    String india = "";
    String china= "";
    china += String.format("￥%,.2f", payment);
    india += String.format("Rs.%,.2f", payment);
    String a = String.valueOf(payment).replace(".",",");
    int decimalIndex = a.indexOf(',');
    stringBuilder.append(a.substring(0,2));
    if(decimalIndex < n) {
        if(decimalIndex > 2) { 
             stringBuilder.append(" ");
             stringBuilder.append(a.substring(2,decimalIndex));
             stringBuilder.append(a.substring(decimalIndex,                                
             decimalIndex+3) + " €");
        }
    } else {
        stringBuilder.append(a.substring(0, n));
        stringBuilder.append(a.substring(decimalIndex, decimalIndex+2));
        stringBuilder.append(" ");
        stringBuilder.append("€");
    }                                                                                      
    String france = stringBuilder.toString();
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}