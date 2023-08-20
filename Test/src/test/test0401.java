package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class test0401 {
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static int[][] visited;
	static int[][] count;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] cars = new int[7][7];
		visited = new int[7][7];
		count = new int[7][7];
		
		int[][] point = new int[2][2];
		for (int i=0;i<7;i++) {
			String str = br.readLine();
			for (int j=0;j<7;j++) {
				int n = Character.getNumericValue(str.charAt(j));
				cars[i][j] = n;
				if (n==1) { // 출발지
					point[0][0] = i;
					point[0][1] = j;
				}
				if (n==4) { // 목적지
					point[1][0] = i;
					point[1][1] = j;
				}
			}
		}
		
		bfs(cars, visited, count, point);
		
		int answer = count[point[1][0]][point[1][1]];
		if (answer==0) {
			answer = -1;
		}

//		System.out.println("빨강차 수");
//		for (int i=0;i<count.length;i++) {
//			for (int j=0;j<count[0].length;j++) {
//				System.out.print(count[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		System.out.println("전체 맵");
//		for (int i=0;i<cars.length;i++) {
//			for (int j=0;j<cars[0].length;j++) {
//				System.out.print(cars[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		System.out.println(answer);

	}
	
	public static void bfs(int[][] cars, int[][] visited, int[][] count ,int[][] point) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {point[0][0],point[0][1]});
		visited[point[0][0]][point[0][1]] = 1;
		
		while (!q.isEmpty()) {
			int[] now = q.poll();
			int x = now[0];
			int y = now[1];
			
			for (int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx>=0 && nx<cars.length && ny>=0 && ny<cars[0].length && visited[nx][ny]!=1 && cars[nx][ny]!=3) {
					visited[nx][ny] = 1;
					q.add(new int[] {nx,ny});
					if (cars[nx][ny]==2) { // 빨강차
						count[nx][ny] = count[x][y] + 1;
					} else {
						count[nx][ny] = count[x][y];
					}
				}
			}
		}
	}

}
