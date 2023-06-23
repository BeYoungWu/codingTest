package level0;

import java.util.Arrays;

public class q38 {

	public static void main(String[] args) {
		// 최댓값 만들기 (1)
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		int answer = 0;
		
		Arrays.sort(numbers);
		int length = numbers.length;
		answer = numbers[length-1] * numbers[length-2];

	}

}
