package level0;

import java.util.Arrays;

public class q32 {

	public static void main(String[] args) {
		// 중앙값 구하기
		
		int[] array = {9, -1, 0};
		
		int answer = 0;
		
		Arrays.sort(array);;
		int n = array.length;
		answer = array[(n-1)/2];
		
		

	}

}
