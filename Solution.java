import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	

	static int distributeCandy(int[] score) {
		int children = score[0];
		int highest = 0;
		int performanceMarking = 0; 
		int candies = 0;
		
		for(int i = 0; i <= children; i++) {
			if(score[i] > highest) {
				highest = score[i];
			}
		}
		if(score[highest-1] > score[highest+1]) {
			performanceMarking = highest-1;
		} else {
			performanceMarking = highest+1;
		}
		if(score[highest] != score[performanceMarking]) {
			candies = ((score[highest] - score[performanceMarking]) + (score[highest] * 2));
		} else {
			candies = (score[highest] * 2);
		}
		return candies;
	}




	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _score_size = Integer.parseInt(in.nextLine());
        int[] _score = new int[_score_size];
        int _score_item;
        for(int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine());
            _score[_score_i] = _score_item;
        }
        
        res = distributeCandy(_score);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
	}

}
