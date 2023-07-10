package level1;

public class q009 {

	public static void main(String[] args) {
		// 정수 제곱근 판별
		
		long n = 121;
		
		long answer = 0;

		while (answer * answer < n) {
			answer++;
		}
		answer = (answer * answer == n) ? (answer + 1) * (answer + 1) : -1;
		
	}

}
