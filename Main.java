/*
* l1: Top Left coordinate of first rectangle.
* r1: Bottom Right coordinate of first rectangle.
* l2: Top Left coordinate of second rectangle.
* r2: Bottom Right coordinate of second rectangle.
*/
import java.util.*;
import java.io.*;

public class Main {

/* 	class Rectangle {
		
		Map<Point> rectangle;
		Points point1;
		Points point2;
		Points point3;
		Points point4;
				
		public Rectangle(Point p1, Point p2) {
			rectangle = new Map<Point>();
			rectangle.put(p1.x, p1.y);
			rectangle.put(p2.x, p1.y);
			rectangle.put(p1.x, p2.y);
			rectangle.put(p2.x, p2.y);		
		}		
		
		public Map<Point> getRectangle() {
			return this.rectangle;
		}
		
		public void setRectangle(Map<Point> points) {
			for (Integer key : points.keySet()) {
				if (rectangle.containsKey(key)) {
					this.points.put(key, points.get(key));
				}
			}
		}
		
		// public void setPoints(Map<Point> shapeRectanglePoints) {
			// Collection collection = shapeRectanglePoints.keySet();
			// int setOfKeys[] = collection.toArray();
			// int setOfValues[] = null;
			// int index = 0;
			// for(shapeRectanglePoints.hasNext()) {
				// setOfValues[index] = shapeRectanglePoints.get(setOfKeys[index]);
			// }			
			// for(int i = 0;i <= setOfKeys.length;i++) {
				
			// }
		// }
		
		// public Map<Point> getPoints(Map<Point> points) {
			// return this.points;
		// }
    } */


	
	// class PointCollision implements Comparator<Rectangle> {		
		// public int compare(Rectangle a, Rectangle b) {			
			// return a.entrySet.compareTo(b.entrySet);
		// }
	// }	
	
	// class PointRectangleMain {

		public static void main(String[] args) throws IOException {
						  
			try { 
				String x;
				int counter = 0;
				boolean intersect = true;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String[] input = new String[4];
				String[] temp = new String[2];
				
				// l1, r1, l2, r2	
				while((x = br.readLine()) != null && !x.contains("exit")) {
					input[counter++] = x;
				}
				
				temp = input[0].split(",");
				Point point1 = new Point(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
				temp = input[1].split(",");
				Point point2 = new Point(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
				temp = input[2].split(",");
				Point point3 = new Point(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
				temp = input[3].split(",");
				Point point4 = new Point(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
				
				if(point1.getPointX() > point4.getPointX() || point3.getPointX() > point2.getPointX()) {
					intersect = false;
				} else if (point1.getPointY() < point4.getPointY() || point3.getPointY() < point2.getPointY()) {
					intersect = false;
				}
				System.out.println("Intersecting Rectangles is: " + !intersect);
				
			} catch (IOException e) {
				System.out.println("An IoException has occurred " + e.toString());
			} catch (Exception e) {
				System.out.println("An Exception has occurred " + e.toString());
			}	
		}
	// }

}

class Point {		
		int x;
		int y;
		boolean intersect;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		// public Point(int x, int y, boolean intersect) {
			// this.x = x;
			// this.y = y;
			// this.intersect = intersect;
		// }
		
		public int getPointX() { 
			return this.x;
		}
		
		public void setPointX(int x) {
			this.x = x;
		}
		
		public int getPointY() { 
			return this.y;
		}
		
		public void setPointY(int y) {
			this.y = y;
		}
		
		public void setIntersect(boolean intersects) {
			this.intersect = intersects;
		}
		
		public boolean getIntersect() {
			return this.intersect;
		}
}