package level1;

public class q019 {

	public static void main(String[] args) {
		// 없는 숫자 더하기
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 0};
		
		int answer = 45;
		
		for (int i=0;i<numbers.length;i++) {
			answer -= numbers[i];
		}

	}

}
