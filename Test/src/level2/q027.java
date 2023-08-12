package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class q027 {

	public static void main(String[] args) {
		// 기능개발
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};

		List<Integer> list = new ArrayList<>();
		int[] works = new int[progresses.length];
		for (int i=0;i<works.length;i++) {
			works[i] = (100 - progresses[i]) / speeds[i];
			if ((100 - progresses[i]) % speeds[i] != 0) {
				works[i]++;
			}
		}
		
		int x = works[0];
		int cnt = 1;
		for (int i=1;i<progresses.length;i++) {
			if (x>=works[i]) {
				cnt++;
			} else {
				list.add(cnt);
				cnt = 1;
				x = works[i];
			}
		}
		list.add(cnt);
		
		int[] answer = new int[list.size()];
		for (int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
		
		// 큐로 푸는 방법
		
		ArrayList<Integer> list2 = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i=0;i<progresses.length;i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				q.add((100 - progresses[i] / speeds[i]));
			} else {
				q.add((100 - progresses[i]) / speeds[i] + 1);
			}
		}
		
		int x2 = q.poll();
		int cnt2 = 1;
		while (!q.isEmpty()) {
			if (x >= q.peek()) {
				cnt2++;
				q.poll();
			} else {
				list2.add(cnt2);
				cnt2 = 1;
				x = q.poll();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
