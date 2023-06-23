package level0;

public class q45 {

	public static void main(String[] args) {
		// 짝수는 싫어요
		
		double n = 10;
		
		double length = Math.ceil(n/2);
		int[] answer = new int[(int)length];
		
		int a = 0;
		for (int i=1;i<=n;i+=2) {
			if(i%2==1) {
				answer[a] = i;
				a += 1;
			}
		}

	}

}
