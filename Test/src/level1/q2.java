package level1;

public class q2 {

	public static void main(String[] args) {
		// 자릿수 더하기
		
		int n = 123;
		
		int answer = 0;
		
		String a = n + "";
		for (int i=0;i<a.length();i++) {
			answer += n%10;
			n /= 10;
		}

	}

}
