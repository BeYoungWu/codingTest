package level1;

public class q006 {

	public static void main(String[] args) {
		// 평균 구하기
		
		int[] arr = {1, 2, 3, 4};
		
		double answer = 0;
		
		for (int i=0;i<arr.length;i++) {
			answer += arr[i];
		}
		answer = answer / arr.length;

	}

}
