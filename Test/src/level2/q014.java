package level2;

public class q014 {

	public static void main(String[] args) {
		// 점프와 순간 이동
		
		int n = 5;
		
		int ans = 0;

		while (n!=0) {
			if (n%2 == 0) {
				n /= 2;
			} else {
				n--;
				ans++;
			}
		}
		
	}

}
