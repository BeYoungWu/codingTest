package level0;

public class q92 {

	public static void main(String[] args) {
		// 세균 증식
		
		int n = 2;
		int t = 10;
		
		int answer = 0;
		
		answer = n * (int)Math.pow(2, t);
		
		// 모범답안
		answer = n << t;

	}

}
