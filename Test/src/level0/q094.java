package level0;

import java.util.Arrays;

public class q094 {

	public static void main(String[] args) {
		// 뒤에서 5등까지
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		int[] answer = new int[5];
		
		Arrays.sort(num_list);
		for (int i=0;i<5;i++) {
			answer[i] = num_list[i];
		}

	}

}
