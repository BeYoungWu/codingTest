package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test0302 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = M; i <= N; i++) {
			int cnt2 = 0;
			for (int j = 1; j <= N; j++) {
				if (i % j == 0) {
					cnt2++;
				}
			}
			if (cnt2 == 3 || cnt2 == 4) {
				cnt2++;
			}
			System.out.println(cnt);
		}

	}
}
