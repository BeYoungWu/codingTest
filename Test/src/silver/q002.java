package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q002 {

	static int[][] dp = new int[41][2];
	
	public static void main(String[] args) throws IOException {
		// 1003. 피보나치 함수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for (int i=0;i<repeat;i++) {
			int tmp = Integer.parseInt(br.readLine());
			fibonacci(tmp);
			System.out.println(dp[tmp][0] + " " + dp[tmp][1]);
		}
		
	}
	
	public static int[] fibonacci(int n) {
		if (n==0) {
			return dp[0];
		} else if (n==1) {
			return dp[1];
		}
		
		if (dp[n][0] == 0 || dp[n][1] == 0) {
			dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
			dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
		
		return dp[n];
	}

}
