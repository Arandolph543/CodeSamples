/*Description: Given a integer convert to roman numeral. 
Author: April Randolph
Date:07/9/2018,10/21/2019 */

import java.util.*;

public class ConvertToRomanNumeral {

	Map<Integer,String> romanNumerals;

	void createRomanNumerals() {
		romanNumerals = new HashMap<>();
		romanNumerals.put(1,"I");
		romanNumerals.put(5,"V");
		romanNumerals.put(10,"X");
		romanNumerals.put(50,"L");
		romanNumerals.put(100,"C");
		romanNumerals.put(500,"D");
		romanNumerals.put(1000,"M");
	}

	String convertNumber(int number) {
		String roman = "";
		int currentNumber = 0;
		while(number > 0) {
			if(number >= 1000) {
				currentNumber = number/1000;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(1000);
				}
				number = (number % 1000);
				if(number > 500) {
					currentNumber = (1000-number)/100;
					for(int j=0;j<currentNumber;j++) {
						roman += romanNumerals.get(100);
					}					
					roman += romanNumerals.get(1000);
					if(number % 100 == 0)
						number = 0;
				}
			}
			if(number >= 500) {
				currentNumber = number/500;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(500);
				}
				number = (number % 500);
				System.out.println(number);
				if(number > 100) {
					currentNumber = (500-number)/100;
					for(int j=0;j<currentNumber;j++) {
						roman += romanNumerals.get(100);
					}					
					roman += romanNumerals.get(500);
				}
			}
			if(number >= 100) {
				currentNumber = number/100;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(100);
				}
				number = (number % 100);
				System.out.println(number);
				if(number > 50) {
					currentNumber = (100-number)/50;
					for(int j=0;j<currentNumber;j++) {
						roman += romanNumerals.get(50);
					}					
					roman += romanNumerals.get(100);
				}
			}
			if(number >= 50) {
				currentNumber = number/50;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(50);
				}
				number = (number % 50);
				System.out.println(number);
				if(number > 10) {
					currentNumber = (50-number)/10;
					for(int j=0;j<currentNumber;j++) {
						roman += romanNumerals.get(10);
					}					
					roman += romanNumerals.get(50);
				}
			}
			if(number >= 10) {
				currentNumber = number/10;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(10);
				}
				number = (number % 10);
				System.out.println(number);
				if(number > 5) {
					currentNumber = (10-number)/5;
					for(int j=0;j<currentNumber;j++) {
						roman += romanNumerals.get(5);
					}					
					roman += romanNumerals.get(10);
				}
			}
			if(number >= 5) {
				currentNumber = number/5;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(5);
				}
				number = (number % 5);
				System.out.println(number);
				if(number > 1) {
					currentNumber = (5-number)/1;
					for(int j=0;j<currentNumber;j++) {
						roman += romanNumerals.get(1);
					}					
					roman += romanNumerals.get(5);
				}
			}
			if(number > 1) {
				currentNumber = number/1;
				for(int i = 0;i<currentNumber;i++) {
					roman += romanNumerals.get(1);
				}
			}
		}
		return roman;
	}
	
	public static void main(String[] args) {
		ConvertToRomanNumeral convertToRomanNumeral = new ConvertToRomanNumeral();
		int number = 2000;
		convertToRomanNumeral.createRomanNumerals();
		System.out.println("Value of : " + number + " to " + convertToRomanNumeral.convertNumber(number));
	}
}
