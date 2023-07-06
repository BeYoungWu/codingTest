package level0;

public class q018 {

	public static void main(String[] args) {
		// 짝수의 합
		
		int n = 20;
		
		int answer = 0;
		
		for (int i=0;i<n+1;i++) {
			if (i%2 == 0) {
				answer += i;
			}
		}

	}

}
