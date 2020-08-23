/*Description: The given int is used to find the look and say sequence return string representing numbers and symbol characters..
Author: April Randolph
Date:04/02/19;08/22/20*/
public class LookAndSaySequence {

	String lookAndSayGenerateNth(int n) {
		int term = 0;
		
		if(n == 1)
			return "1";
		if(n == 2)
			return "11";
		
		String seq = "11";
		for(int i =3;i<n;i++) {
			String temp = "";
			int count = 1;
			seq += '$';
			int length = seq.length();
			for(int j=1;j<length;j++) {
				if(seq.charAt(j) != seq.charAt(j-1)) {
					temp += count;
					temp += seq.charAt(j-1);
					count = 1;
				} else {
					count++;
				}
			}
			seq = temp;
		}
		return seq;
		
	}

	public static void main(String[] arg) {
		LookAndSaySequence lass = new LookAndSaySequence();
		int n = 	
		String nthSequence = "";
		nthSequence = lass.lookAndSayGenerateNth(n);
		System.out.print(nthSequence);
	}
}
