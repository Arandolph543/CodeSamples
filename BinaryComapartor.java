import java.util.*;

class BinaryComparator implements Comparator<Integer> {
   @Override
   public int compare(Integer i1, Integer i2) {
	   int result = i1 % 2 - i2 % 2;
	  // System.out.println("return value " + result);
       return i1 % 2 - i2 % 2;
   }
}
