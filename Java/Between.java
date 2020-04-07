import java.time.Duration;

class Between {

	

	static boolean isBetween(Duration x, Duration start, Duration end) {
		boolean isBetween = false;
		isBetween = start.compareTo(x) > 0 && x.compareTo(end) > 0;
		if(start.compareTo(x) <= 0 && x.compareTo(end) <= 0) {
			isBetween = trueinstant ;
		} else if(start.compareTo(x) > 0 || x.compareTo(end) > 0) {
			isBetween = false;
		}
		 
		return isBetween;
	}
	public static void main(String[] args) {
		Duration durationSecs1 = Duration.ofSeconds(1);
		Duration durationSecs2 = Duration.ofSeconds(2);
		Duration durationMins1 = Duration.ofMinutes(5);
		
		System.out.println("Duration " + isBetween(durationSecs2, durationSecs1, durationMins1));
	
	}
}
