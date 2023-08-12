package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class q028 {

	public static void main(String[] args) {
		// 프로세스
		
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		int answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i=0;i<priorities.length;i++) {
			pq.add(priorities[i]);
		}
		
		while (!pq.isEmpty()) {
			for (int i=0;i<priorities.length;i++) {
				if (priorities[i] == pq.peek()) {
					if (i == location) {
						answer++;
//						return answer;
					}
					pq.poll();
					answer++;
				}
			}
		}
//		return -1;
		
	}

}
