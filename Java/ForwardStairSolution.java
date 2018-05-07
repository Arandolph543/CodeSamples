import java.util.*;
import java.math.*;

public class ForwardStairSolution {
	
    static void StairCase(int n) {
        String stair = "";
        for(int j = 1; j <= n; j++) {
            for(int i = 1; i <= n; i++) {
				if(i <= n-j) {
                   stair += " ";
				} else {
                   stair += "#";    
				}				
            }
            System.out.println(stair.toString());
            stair = "";
        } 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = Integer.parseInt(in.nextLine().trim());
		
		StairCase(n);
	}
}
