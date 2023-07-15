package level2;

import java.util.HashSet;
import java.util.Set;

public class q019 {

	public static void main(String[] args) {
		// 연속 부분 수열 합의 개수
		
		int[] elements = {7, 9, 1, 1, 4};

		int answer = 0;
		
		Set<Integer> set = new HashSet<>();
		
		int size = 1;
		while (size <= elements.length) {
			int sum = 0;
			
			for (int i=0;i<size;i++) {
				sum += elements[i % elements.length];
				set.add(sum);
			}
			
			for (int i=0;i<elements.length;i++) {
				sum -= elements[i % elements.length];
				sum += elements[(i+size) % elements.length];
				set.add(sum);
			}
			
			size++;
		}
		
		answer = set.size();
				
	}

}
