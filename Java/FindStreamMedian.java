import java.util.*;
import java.lang.*;
import java.io.*;

public class FindStreamMedian {

	public String findMedian(List<Integer> inputsElements) {
		int sum = 0;
		for(Integer num : inputsElements) {
			sum += num;			
		}
		return String.valueOf(Math.floor(sum/2));
	}

	public static void main(String[] args) {
		FindStreamMedian fsm = new FindStreamMedian();
		System.out.println("Please enter the first number of Stream median finder: ");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		List<Integer> numbers = new ArrayList<>();
		int index = 0;
		try {
			while((input = buffer.readLine()) != null) {
				numbers.add(Integer.parseInt(input.toString()));
				System.out.println("The median is: " + fsm.findMedian(numbers));
				index++;
			}
		}catch(IOException ex) {
			System.out.println(ex.toString());
		}
	}
}
