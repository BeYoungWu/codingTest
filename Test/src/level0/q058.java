package level0;

import java.util.Arrays;

public class q058 {

	public static void main(String[] args) {
		// n 번째 원소부터
		
		int[] num_list = {2, 1, 6};
		int n = 3;
		
		int[] answer = new int[num_list.length-n+1];
		
		int index = 0;
		for (int i=0;i<num_list.length-n+1;i++) {
			answer[index] = num_list[n+i-1];
			index++;
		}
		
		// 모범답안
		answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
		

	}

}
