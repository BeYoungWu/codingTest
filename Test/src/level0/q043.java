package level0;

public class q043 {

	public static void main(String[] args) {
		// 자릿수 더하기
		
		int n = 1234;
		
		int answer = 0;
		
		String ns = "" + n;
		for (int i=0;i<ns.length();i++) {
			answer += Integer.parseInt(ns.substring(i, i+1));
		}

		// 모범답안
		while(n>0) {
			answer += n%10; // 10으로 나눈 나머지는 1의 자리 숫자
			n /= 10; // 1의 자리 숫자 구한 후 다음 숫자로 갱신
		}
		
	}

}
