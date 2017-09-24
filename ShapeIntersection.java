import java.util.*;
import java.io.*;

public class Main {

	static Map<Integer, Integer> A;
	static Map<Integer, Integer> B;
	static Integer[] points;
	static Boolean intersects;
	
	public boolean compare(HashMap A, HashMap B) {
		Iterator rectangle1 = A.entrySet().iterator();
		Iterator rectangle2 = B.entrySet().iterator();
		intersects = false;
		
		while(rectangle1.hasNext()) {
			Map.Entry a = (Map.Entry)rectangle1.next();
			while(rectangle2.hasNext()) {
				Map.Entry b = (Map.Entry)rectangle2.next();
				if(a.getKey().equals(b.getKey()) && a.getValue().equals(b.getValue()))	{
				 intersects = true;
				}
			}
		
		return intersects;
	}

	public Map<Integer, Integer> mapRectangle(int x, int y, int v, int w) {
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		
		for(int i = y; i<=v; i++) {
			for(int j = x; j<=w; j++) {
				temp.put(i, j);
			}
		}		
		return temp;
	}

	public static void main(String[] ar) {
                  
        try { 
            String x;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
            if((x = br.readLine()) != null) {
				points = x.split(" ");
            }
			A = mapRectangle(points[0], points[1], points[2], points[3]);
			B = mapRectangle(points[4], points[5], points[6], points[7]);
			System.out.println(intersects(A, B).toString());
			
          } catch (IOException e) {
    			System.out.println("An IoException has occurred " + e.toString());
    	  } catch (Exception e) {
    			System.out.println("An Exception has occurred " + e.toString());
    	  }	
	}
}
