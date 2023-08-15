package test;

import java.util.Collections;
import java.util.PriorityQueue;

public class test0101 {

	public static void main(String[] args) {
		
		String[] algorithms = {"bfd", "dfsss", "sortsddd"};
		long n = 12;
		
		long answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0;i<algorithms.length;i++) {
			pq.add(algorithms[i].length());
		}
		
		answer = (n%pq.poll()==0) ? n/pq.poll() : n/pq.poll() + 1;

		System.out.println(answer);

	}

}
