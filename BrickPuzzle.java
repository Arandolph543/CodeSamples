import java.util.*;
import java.lang.*;

public class BrickPuzzle {

	public boolean makeBricks(int small, int big, int goal) {
		boolean build = false;
		int length = 0;
		int bbMeasure = 0;
		
		if(goal > 0) {
			if(small > 0) {
				length = small;
			}
			if(big > 0) {
				length = length + (big *5);
			}			
		}
		if(length >= goal) {
			if(goal%5 == 1) {
				bbMeasure = goal/5;
			}
		}
		
		
	}



	public static void main(String[] args) {
		BrickPuzzle puz = new BrickPuzzle();
		
		
	}





}
