import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class MedianStreamAverage {

	static int findMedian(List<Integer> numberStream, int n) {
		int median = 0;
		Collections.sort(numberStream);
		for(int i = 0; i<n;i++) {
			if(n%2 == 0) {
				median = (numberStream.get(n/2 -1) + numberStream.get(n/2 +1))/2;
			} else if(n%2 == 1) {
				median = numberStream.get(n/2);
			}
		}
		return median;
	}

	public static void main(String[] args) {
		List<Integer> streamOfNumbers = new ArrayList<>();
		streamOfNumbers.add(5);
		streamOfNumbers.add(6);
		streamOfNumbers.add(4);
		streamOfNumbers.add(8);
		streamOfNumbers.add(6);
		int n = streamOfNumbers.size();
		System.out.println(findMedian(streamOfNumbers, n));
	}
}
