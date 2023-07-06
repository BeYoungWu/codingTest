package level0;

public class q020 {

	public static void main(String[] args) {
		// 양꼬치
		
		int n = 10;
		int k = 3;
		
		int answer = 0;
		
		if (k>=n/10) {
			answer = 12000 * n + 2000 * k - 2000 * (n/10);
		} else {
			answer = 12000 * n;
		}

	}

}
