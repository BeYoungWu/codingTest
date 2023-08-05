package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q001 {

	public static void main(String[] args) throws IOException{
		// 2851. 슈퍼 마리오

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] mush = new int[11];
		int d = 100;
		int ans = 0;
		for (int i=1;i<=10;i++) {
			mush[i] = mush[i-1] + Integer.parseInt(br.readLine());
			if (d >= Math.abs(mush[i]-100)) {
				d = Math.abs(mush[i]-100);
				ans = mush[i];
			}
		}
		
		System.out.println(ans);
		
	}

}
