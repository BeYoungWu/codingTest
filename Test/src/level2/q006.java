package level2;

public class q006 {

	public static void main(String[] args) {
		// 숫자의 표현
		
		int n = 15;
		
		int answer = 0;
		
		for (int i=1;i<=n;i++) {
			int sum = 0;
			for (int j=i;j<=n;j++) {
				sum += j;
				if(sum == n) {
					answer++;
					break;
				} else if (sum>n) {
					break;
				}
			}
		}
		
		// 다른 답안 : 정수론 (주어진 수의 홀수 약수 개수와 같다)

	}

}
