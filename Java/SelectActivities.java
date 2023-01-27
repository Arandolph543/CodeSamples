import java.util.ArrayList;
import java.util.List;

public class SelectActivities {

	List<Integer> findActivites(int[] startTimes, int[] finishTimes) {
		List<Integer> times = new ArrayList<>();
		times.add(0);
		int index = 0;
		for(int i = 1;i<startTimes.length;i++) {
			if(startTimes[i] >= finishTimes[index]) {
				if(!times.contains(i)) {
					times.add(i);
				} 
				index = i;
			}
		}
		return times;
	}

	public static void main(String[] args) {
		SelectActivities classSelectActivites = new SelectActivities();
		int[] start = {1, 0, 3, 6,4};
		int[] finish = {2, 2, 5, 8, 9};
		List<Integer> taskActivites = classSelectActivites.findActivites(start, finish);
		for(Integer indice : taskActivites) {
			System.out.print(indice + ",");
		}
	}

}
