import java.lang.*;
import java.util.*;

public class ShapeCoordIntersect {

	static int x;
	static int y;

	public void ShapeCoordIntersect(ShapeCoordIntersect w) {
		this.x = w.getx();
		this.y = w.gety();
	}

	public static boolean equals(ShapeCoordIntersect compare) {
		return compare.x.equals(this.x) && compare.y.equals(this.y);		
	}






	public static void main(String[] args) {

	
	}
}
