package level2;

public class q012 {

	public static void main(String[] args) {
		// 예상 대진표
		
		int n = 8;
		int a = 4;
		int b = 7;
		
		int answer = 0;
		
		while (true) {
			a = a/2 + a%2; // 그룹을 의미
			b = b/2 + b%2;
			answer++;
			if (a==b) {
				break;
			}
		}

	}

}
