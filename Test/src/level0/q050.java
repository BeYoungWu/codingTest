package level0;

public class q050 {

	public static void main(String[] args) {
		// 조건에 맞게 수열 변환하기
		
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		
		int[] answer = {};

		if (k%2==0) {
			for (int i=0;i<arr.length;i++) {
				answer[i] = arr[i] + k;
			}
		} else {
			for (int i=0;i<arr.length;i++) {
				answer[i] = arr[i] * k;
			}
		}
		
	}

}
