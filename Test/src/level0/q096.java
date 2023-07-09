package level0;

public class q096 {

	public static void main(String[] args) {
		// 개미 군단
		
		int hp = 23;
		
		int answer = 0;
		
		int a = hp / 5;
		int b = (hp-(a*5)) / 3;
		int c = hp - (a*5) - (b*3);
		
		answer = a + b + c;

	}

}
