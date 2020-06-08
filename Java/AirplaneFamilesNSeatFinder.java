import java.lang.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
//Available 4seatsections from B-E[1-4] F-J[5-9] with aisles else D-G[3-7]

class AirplaneFamilesNSeatFinder {
    static int solution(int N, String S) {
		String[] seats = S.split(" ");
		int numberOfFamilySeats = 0;
		int[][] planeSeats = new int[N][10];
		Map<Integer, Integer> seatsMap = new HashMap<Integer, Integer>();
		
		int[][] takenSeats = new int[N][10];
		seatsMap = validSeats(S, N);
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(seatsMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		for(int i = 0;i<N;i++) {
			for(int k=0;k<10;k++) {
				for(Map.Entry<Integer, Integer> seatAssigned : list) {
					int seat = seatAssigned.getKey();
					int row = seatAssigned.getValue();
					if(seat==i && row==k)
						takenSeats[i][k] = 1;					
				}
			}
		}
		int seatsNeeded = seats.length*4;
		if(seatsNeeded<(N*10)) {
			for(int i = 0;i<N;i++) {
				for(int k=0;k<10;k++) {
					if((k+1)<10) {
						k=k+1;
						boolean foundSeat = false;
						if(k==1 && (k+3)<10 && takenSeats[i][k+1]!=1 && takenSeats[i][k+2]!=1 && takenSeats[i][k+3]!=1&& takenSeats[i][k+4]!=1) {
							foundSeat = true;
						}else if(k==3 && (k+3)<10 && takenSeats[i][k+1]!=1 && takenSeats[i][k+2]!=1 && takenSeats[i][k+3]!=1&& takenSeats[i][k+4]!=1) {
							foundSeat = true;
							takenSeats[i][3]=1;
						}else if(k==5 && (k+3)<10 && takenSeats[i][3]!=1 && takenSeats[i][k+1]!=1 && takenSeats[i][k+2]!=1 && takenSeats[i][k+3]!=1&& takenSeats[i][k+4]!=1) {
							foundSeat = true;
						}
						if(foundSeat) {
							numberOfFamilySeats++;
							i++;
						}
						foundSeat = false;
					}
				}
			}
			
		} else {
			return 0;
		}
		return numberOfFamilySeats;
	}

	static Map<Integer, Integer> validSeats(String S, int N) {
		String[] seats = S.split(" ");
		int length = seats.length;
		Pattern p = Pattern.compile("-?\\d+");
		Map<Integer, Integer> tempSeatsMap = new HashMap<Integer, Integer>();
		String[] rowNames = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K"};
		for(int i = 0;i<length;i++) {
			for(int k = 0;k<rowNames.length;k++) {
				if(seats[i].contains(rowNames[k])) {
					Matcher m = p.matcher(seats[i]);
					Integer seat = 0;
					while (m.find()) {
					  seat =Integer.parseInt(m.group());
					}
					if(seat<=N) {
						tempSeatsMap.put(seat, k);
					}
				}
			}
		}
		return tempSeatsMap;
	}

	public static void main(String[] args) {
		String s = "1A 2F 1C";
		System.out.println("Number of families " + solution(3, s));
	}

}
