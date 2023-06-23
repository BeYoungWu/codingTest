package level0;

public class q40 {

	public static void main(String[] args) {
		// 순서쌍의 개수
		
		int n = 20;
		
		int answer = 0;

		for (int i=1;i<n+1;i++) {
			if(n%i==0) {
				answer += 1;
			}
		}
		
	}

}
