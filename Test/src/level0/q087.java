package level0;

public class q087 {

	public static void main(String[] args) {
		// 제곱수 판별하기
		
		int n = 144;
		
		int answer = 0;
		
		for (int i=0;i<n;i++) {
			if (i*i==n) {
				answer = 1;
				break;
			} else {
				answer = 2; 
			}
		}
		
		// 모범답안
		answer = (n % Math.sqrt(n) == 0) ? 1 : 2;

	}

}
