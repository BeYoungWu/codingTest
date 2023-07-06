package level0;

public class q025 {

	public static void main(String[] args) {
		// 중복된 숫자 개수
		
		int[] array = {1, 2, 3, 4};
		int n = 1;
		
		int answer = 0;
		
		for (int i=0;i<array.length;i++) {
			if (n==array[i]) {
				answer += 1;
			}
		}

	}

}
