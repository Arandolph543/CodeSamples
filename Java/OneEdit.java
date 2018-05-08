public class OneEdit {


	int min(int x, int y, int z) {
		int min = 0;
		if(y<=x && y<=z) {
			min = y;
		}else if(x<=y && x<=z) {
			min = x;
		}else if(z<=x && z<=y) {
			min = z;
		}
		return min;		
	}


	public int checkOneEdited(String strEditable1, String strEditable2, int l, int h) {
			if(l== 0)
				return h;
			
			if(h == 0)
				return l;
			
			if(strEditable1.charAt(l-1) == strEditable2.charAt(h-1))
				return checkOneEdited(strEditable1, strEditable2, l-1, h-1);
			
			return 1 + min (checkOneEdited(strEditable1, strEditable2, l, h-1), 
							checkOneEdited(strEditable1, strEditable2, l-1, h), 
							checkOneEdited(strEditable1, strEditable2, l-1, h-1));
		
	}






	public static void main(String[] main) {
		OneEdit oe = new OneEdit();
		System.out.println("The string cats and cates are : " + oe.checkOneEdited("cates", "cats", 0, 5));
		
		
	}






}
