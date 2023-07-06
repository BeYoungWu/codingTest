package level0;

import java.util.Arrays;

public class q052 {

	public static void main(String[] args) {
		// 뒤에서 5등 위로
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		int[] answer = new int[num_list.length-5];
		
		Arrays.sort(num_list);
		for (int i=0;i<num_list.length-5;i++) {
			answer[i] = num_list[i+5];
		}
		
		// 모범답안
		answer = Arrays.stream(num_list).sorted().skip(5).toArray();

	}

}
