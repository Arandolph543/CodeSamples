/*Description: Using Lambda find the sorted list and print.
Author: April Randolph
Date: 03/22/20
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.IntStream;
import java.lang.*;
import java.io.*;

class FindLambdaArrayOrder {
	
	static void DefineLambdaSortForIntegersGreatestToSmallest() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(983);
		list.add(343);
		list.add(4545);
		list.add(232);
		list.add(532);
		list.add(4078);
		list.add(336);
		Collections.sort(list, (subsect1, subsect2) -> (subsect1 > subsect2) ? -1 : (subsect1 < subsect2) ? 1 : 0);
		
		System.out.println(list.toString());
	}
	
	public static void main(String[] arg) {
		DefineLambdaSortForIntegersGreatestToSmallest();
		
	}

}