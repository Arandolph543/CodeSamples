import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


public class ElevatorSim {

	public static int solution(int[] A, int[] B, int M, int X, int Y) {
        if (A == null || B == null || A.length == 0 || B.length == 0 || X < 1 || Y < 1) {
            return 0;
        }
        int res = 0;
        Queue<Task> taskQueue = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > Y) {
                throw new RuntimeException("This should not happen!");
            }
            taskQueue.add(new Task(A[i], B[i]));
        }
        while (!taskQueue.isEmpty()) {
            res += helper(taskQueue, M, X, Y);
        }
        return res;
    }
	
	static int helper(Queue<Task> taskQueue, int M, int X, int Y) {
        BitSet floors = new BitSet(M);
        while (!taskQueue.isEmpty() && X > 0 && (Y - taskQueue.peek().weight) >= 0) {
            Task task = taskQueue.poll();
            X -= 1;
            Y -= task.weight;
            floors.set(task.floor);
        }
        return floors.cardinality() + 1;
    }

	public static void main(String[] args) {
		int[] A = new int[] {40, 40, 100, 200, 20};
        int[] B = new int[] {3, 3, 2, 2, 3};
        int M = 3;
        int X = 1;
        int Y = 200;
		int openClose = solution(A,B,M,X,Y);
		System.out.println(openClose);
	
	
	
	}

	static class Task {
        int weight;
        int floor;

        public Task(int weight, int floor) {
            this.weight = weight;
            this.floor = floor;
        }
    }

}
