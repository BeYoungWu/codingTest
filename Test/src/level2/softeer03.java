package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
	int x;
	int y;
	
	Point(int y, int x){
		this.x = x;
		this.y = y;
	}
}

public class softeer03 {

	static Queue<Point> qpoint = new LinkedList<>();
	
	static int[][] arr;
	static int[][] checkArr;
	
	public static void main(String[] args) throws IOException {
		// 장애물 인식 프로그램
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		checkArr = new int[n][n];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				checkArr[i][j] = 0;
			}
		}
		
		// 배열에 평면좌표 담기
		for (int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j=0;j<n;j++) {
				arr[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		// 평면좌표를 훑으면서 면적 구하고 넓이들을 리스트에 담기
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				// 해당 좌표가 장애물이고, 확인하지 않았던 좌표면 진행
				if (arr[i][j]==1 && checkArr[i][j]!=1) {
					int c = line(i, j);
					list.add(c);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static int line(int a, int b) {
		int cnt = 0;
		
		qpoint.offer(new Point(a, b));
		checkArr[a][b] = 1;
		cnt++;
		while (!qpoint.isEmpty()) {
			Point tmp = qpoint.poll();
			
			// 현재 좌표의 아래 확인
			if (tmp.y < arr.length-1) { // 맨 밑 제외
				if (arr[tmp.y+1][tmp.x]==1 && checkArr[tmp.y+1][tmp.x]!=1) { // 아래
					qpoint.offer(new Point(tmp.y+1, tmp.x));
					checkArr[tmp.y+1][tmp.x] = 1;
					cnt++;
				}
			}
			
			// 현재 좌표의 위 확인
			if (tmp.y > 0) { // 맨 위 제외
				if (arr[tmp.y-1][tmp.x]==1 && checkArr[tmp.y-1][tmp.x]!=1) {
					qpoint.offer(new Point(tmp.y-1, tmp.x));
					checkArr[tmp.y-1][tmp.x] = 1;
					cnt++;
				}
			}
			
			// 현재 좌표의 오른쪽 확인
			if(tmp.x > 0) { // 맨 오른쪽 제외
				if(arr[tmp.y][tmp.x-1] == 1 && checkArr[tmp.y][tmp.x-1] != 1) { // 좌
					qpoint.offer(new Point(tmp.y, tmp.x-1));
					checkArr[tmp.y][tmp.x-1] = 1;
					cnt++;
				}				
			}
			
			// 현재 좌표의 왼쪽 확인
			if(tmp.x < arr.length - 1) { // 맨 왼쪽 제외
				if(arr[tmp.y][tmp.x+1] == 1 && checkArr[tmp.y][tmp.x+1] != 1) { // 우
					qpoint.offer(new Point(tmp.y, tmp.x+1));
					checkArr[tmp.y][tmp.x+1] = 1;
					cnt++;
				}				
			}
			
		}
		return cnt;
	}
}

