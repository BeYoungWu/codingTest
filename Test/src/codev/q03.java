package codev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q03 {
	
	public static void main(String[] args) throws IOException{
		// Product Defects
		int answer = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		br.readLine();
		
		// 입력받은 데이터 넣기
		int[][] arr = new int[n+1][n+1];
		for (int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1;j<=n;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// DP 배열 활용 풀이
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				if (arr[i][j]==1) {
					arr[i][j] = getMinimum(arr[i-1][j-1], arr[i-1][j], arr[i][j-1]) + 1; // 현재 위치 기준 좌, 좌측위대각, 위의 최솟값 + 1이 정사각형 변 길이
					answer = answer > arr[i][j] ? answer : arr[i][j]; // 최대 정사각형 변 길이
				}
			}
		}
		
		System.out.print(answer);
	}
	
	public static int getMinimum(int a, int b, int c) {
		
		a = a < b ? a : b;
		
		return a < c ? a : c;
	}


}
