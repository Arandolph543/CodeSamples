import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumArray {

	static int sum(int[] arr) {
		int sum = 0;

		for(int i = 0; i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
    }

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			final String fileName = System.getenv("file");
			System.out.println(fileName);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			long res;
			
			int _arr_size = Integer.parseInt(in.nextLine());
			int[] _arr = new int[_arr_size];
			int _arr_item;
			for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
				_arr_item = Integer.parseInt(in.nextLine());
				_arr[_arr_i] = _arr_item;
			}
			
			res = sum(_arr);
			bw.write(String.valueOf(res));
			bw.newLine();
			
			bw.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
