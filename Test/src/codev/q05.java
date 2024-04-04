package codev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q05 {

	static int answer = 0;
	static int[] paintedColor;
	
	public static void main(String[] args) throws IOException{
		// Coloring Houses

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		paintedColor = new int[n];
		
		if (n%2!=0) {
			System.out.print("짝수를 입력하시오.");
			return;
		}
		
		// dfs(깊이 우선 탐색)으로 모든 경우의 수 탐색
		for (int i=0;i<n;i++) {
			paintedColor[i] = -1; // 기본 값 -1로 설정
		}
		paintedColor[0] = 0;
		colorCheck(n, 1);
			
		System.out.print(answer*3);
	}

	public static void colorCheck(int n, int depth) {
		if (depth==n-1) {
			for (int i=0;i<3;i++) {
				if (paintedColor[depth-1]!=i && paintedColor[n-1-depth]!=i) {
					answer++;
				}
			}
			return;
		}
		
		// 1. 앞 집과 다른 색
		// 2. 양끝으로부터 거리가 같은 집과 다른 색 (n-1-현재인덱스)
		for (int i=0;i<3;i++) {
			if (paintedColor[depth-1]!=i && paintedColor[n-1-depth]!=i) {
				paintedColor[depth] = i;
				colorCheck(n, depth+1);
				paintedColor[depth] = -1;
			}
		}
		
		
	}
	
}
