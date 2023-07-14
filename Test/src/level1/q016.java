package level1;

import java.util.Arrays;

public class q016 {

	public static void main(String[] args) {
		// 나누어 떨어지는 숫자 배열
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		int len = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%divisor==0) {
				len++;
			}
		}
		
		int[] answer = (len!=0) ? new int[len] : new int[1];
		int index = 0;
		if (len==0) {
			answer[0] = -1;
		} else {
			for (int i=0;i<arr.length;i++) {
				if (arr[i]%divisor==0) {
					answer[index] = arr[i];
					index++;
				}
			}
		}
		Arrays.sort(answer);
		
		
	}

}
