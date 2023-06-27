package level0;

public class q83 {

	public static void main(String[] args) {
		// 주사위 게임 1
		
		int a = 3;
		int b = 5;
		
		int answer = 0;
		
		if (a%2==1 && b%2==1) {
			answer = a*a + b*b;
		} else if (a%2==1 || b%2==1) {
			answer = 2 * (a + b);
		} else {
			if (a>b) {
				answer = a - b;
			} else {
				answer = b - a;
			}
			// 모범답안 (절대값)
			answer = Math.abs(a - b);
		}

	}

}
