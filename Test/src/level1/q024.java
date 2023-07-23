package level1;

public class q024 {

	public static void main(String[] args) {
		// 약수의 개수와 덧셈
		
		int left = 13;
		int right = 17;
		
		int answer = 0;
		
		for (int i=left;i<=right;i++) {
			int cnt = 0;
			for (int j=1;j<=i;j++) {
				if (i%j==0) {
					cnt++;
				}
			}
			answer = (cnt%2==0) ? answer+i : answer-i;
		}

	}

}
