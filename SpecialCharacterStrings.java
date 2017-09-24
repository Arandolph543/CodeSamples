import java.util.*;
import java.lang.*;
import java.io.*;

public class SpecialCharacterStrings {
   
    public static boolean containsString(Object item) {
        String tempCharArray = String.valueOf(item);
        char[] charArray = tempCharArray.toCharArray();
        boolean specChar = false;
        for(int i = 0;i<charArray.length;i++) {
            System.out.println("Debug " + charArray[i]);
            if(Character.getType(charArray[i]) >= 32 && Character.getType(charArray[i]) <= 47) {
                specChar = true;                
            }
        }
        return specChar;        
    }  
    
   static Iterator func(List<String> mylist){
      Iterator it= mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if((element instanceof Integer) && containsString(element))//Hints: use instanceof operator
            break;
      }
      return it;
      
   }
   
	@SuppressWarnings({ "unchecked" })
	public static void main(String []args){
		List<String> mylist = new ArrayList<>();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int index = 0;
		try{
			String entry = buff.readLine();
			while(entry != null || entry != "") {
				System.out.println("Debug: " + entry.toString() + " " + index);
				index++;
				mylist.add(entry);
				if(index == 2) {
					mylist.add("###");
				}
				entry = buff.readLine();
			}
		} catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}

		Iterator it=func(mylist);
		while(it.hasNext()){
			Object element = it.next();
			System.out.println((String)element);
		}
	}
}
