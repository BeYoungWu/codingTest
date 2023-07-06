package level0;

import java.util.Arrays;

public class q031 {

	public static void main(String[] args) {
		// 배열 자르기
		
		int[] numbers = {1, 3, 5};
		int num1 = 1;
		int num2 = 2;
		
		int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);

	}

}
