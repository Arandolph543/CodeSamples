import java.util.ArrayList;
import java.util.List;

public class SelectActivities {

	List<Integer> findActivites(int[] startTimes, int[] finishTimes) {
		int activityTimerPlace = startTimes[0];
		List<Integer> times = new ArrayList<>();
		int index = 0;
		for(int i = 0;i<startTimes.length;i++) {
			for(int j=0;j<finishTimes.length;j++) {
				if(i == j) {
					if(startTimes[i] < finishTimes[j]) {
						if(startTimes[i] >= activityTimerPlace && ((j+1 < finishTimes.length && startTimes[j+1] >= activityTimerPlace) || finishTimes[j] > startTimes[j])) {
							activityTimerPlace = finishTimes[j];
							if(!times.contains(i)) {
								times.add(i);
							}
							index++;
						}
					}
					
				}	
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
