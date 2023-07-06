package level1;

public class q005 {

	public static void main(String[] args) {
		// x만큼 간격이 있는 n개의 숫자
		
		int x = 2;
		int n = 5;
		
		long[] answer = new long[n];
		for (int i=0;i<n;i++) {
			answer[i] = x + (long)x*i;
		}
		
		// 모범답안
		answer[0] = x;
		for (int i=1;i<n;i++) {
			answer[i] = answer[i-1] + x;
		}
		

	}

}
