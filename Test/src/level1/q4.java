package level1;

public class q4 {

	public static void main(String[] args) {
		// 나머지가 1이 되는 수 찾기
		
		int n = 10;
		
		int answer = 0;
		
		for (int i=1;i<n;i++) {
			if (n%i==1) {
				answer = i;
				break;
			}
		}

	}

}
