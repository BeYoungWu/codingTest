package codev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class q01 {

	static int[][] arr;
	static boolean[] chk;
	static Map<Integer, Integer> map = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		// Meeting Scheduler
		int answer = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		arr = new int[n][m];
		chk = new boolean[n];
		
		// 입력받은 데이터 넣기
		for (int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 회의 종료 시간, 시작 시간 오름차순 정렬
		Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		
		// 배열 한바퀴 순회하며 남는 회의 없도록
		for (int i=0;i<n;i++) {
			if (!chk[i]) {
				answer++; // 새로운 회의실 추가
				chk[i] = true;
				putTime(n, i, arr[i][1]);
			}
		}
		System.out.print(answer);
	}
	
	public static void putTime(int n, int prev, int end) {
		// 배열 끝에 도달했을 경우 종료
		if (prev+1>=n) {
			return;
		}
		
		// 현재 회의실 마지막 회의 종료 시간과 다음 회의 시작 시간 비교해서 같거나 크면 지워가고 끝나는 시간 이어받기
		for (int i=prev+1;i<n;i++) {
			if (!chk[i] && arr[prev][1]<=arr[i][0]) {
				chk[i] = true;
				putTime(n, i, arr[i][1]);
			}
		}
	}
	
}
