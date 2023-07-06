package level0;

import java.util.Arrays;

public class q074 {

	public static void main(String[] args) {
		// n 번째 원소까지
		
		int[] num_list = {2, 1, 6};
		int n = 1;
		
		int[] answer = new int[n];
		
		for (int i=0;i<n;i++) {
			answer[i] = num_list[i];
		}
		
		// 모범답안
		answer = Arrays.copyOfRange(num_list, 0, n);

	}

}
