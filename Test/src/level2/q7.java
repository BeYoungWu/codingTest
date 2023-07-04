package level2;

public class q7 {

	public static void main(String[] args) {
		// 다음 큰 숫자
		
		int n = 78;
		
		int answer = 0;
	
		int count1 = Integer.bitCount(n);
		int count2 = 0;
		while (true) {
			n++;
			count2 = Integer.bitCount(n);
			if (count1==count2) {
				answer = n;
				break;
			}
		}
		
	}

}
