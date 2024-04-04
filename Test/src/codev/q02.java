package codev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q02 {
	
	static String[] name;
	static int[] price;
	static int[] weight;
	static boolean[] chk;
	
	public static void main(String[] args) throws IOException {
		// Duplicated Product
		int answer = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		name = new String[n];
		price = new int[n];
		weight = new int[n];
		
		// 입력받은 데이터 넣기
		for (int i=0;i<n;i++) {
			name[i] = br.readLine();
		}
		br.readLine();
		for (int i=0;i<n;i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		br.readLine();
		for (int i=0;i<n;i++) {
			weight[i] = Integer.parseInt(br.readLine());
		}
		
		// 하나하나 같은 데이터가 있는지 확인하는 작업
		chk = new boolean[n];
		for (int i=0;i<n;i++) {
			if (!chk[i]) {
				chk[i] = true;
				int k = sameCheck(n, i);
				answer += k;
			}
		}
		
		System.out.print(answer);
		
	}
	
	public static int sameCheck(int n, int num) {
		int cnt = 0;
		for (int i=0;i<n;i++) {
			if(!chk[i]) {
				if (name[num].equals(name[i]) && price[num]==price[i] && weight[num]==weight[i]) {
					cnt++;
					chk[i] = true;
				}
			}
		}
		
		return cnt;
	}

}
