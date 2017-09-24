class testIncrementClass {
	static class CountNumberClass {
		private int number;
		
		CountNumberClass() {
		}
		
		public void setNumber(int x) {
			this.number = x;
			System.out.println("this number : " + this.number);
			this.number = this.number++;
			System.out.println("this number : " + this.number);
			int placeHolder = this.number;
			System.out.println("this number : " + ++placeHolder);
		}
		
		public int getNumber() {
			return number;
		}
		
		
	}


	public static void main(String[] args) {
		testIncrementClass.CountNumberClass in = new testIncrementClass.CountNumberClass();
		in.setNumber(3);
		int index = in.getNumber();
		System.out.println("index " + index);
		// index++;
		index = index + 1;
		System.out.println("index +1 : " + index + " and increment by 1 more " + index+1);
		
		
	}

}
