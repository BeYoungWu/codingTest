package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class test0401 {
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[][] cars = new int[7][7];
		int[][] cars = {{0,0,0,3,0,3,3},{0,1,0,3,0,3,3},{0,0,0,0,0,3,3},{3,2,2,2,0,3,3},{3,0,0,0,2,0,2},{3,0,2,0,0,4,0},{3,0,0,0,2,0,0}};
		visited = new boolean[7][7];
		
		int[][] point = new int[2][2];
		for (int i=0;i<7;i++) {
//			String str = br.readLine();
			for (int j=0;j<7;j++) {
//				int n = Character.getNumericValue(str.charAt(j));
//				cars[i][j] = n;
//				if (n==1) { // 출발지
				if (cars[i][j]==1) {
					point[0][0] = i;
					point[0][1] = j;
				}
//				if (n==4) { // 목적지
				if (cars[i][j]==4) {
					point[1][0] = i;
					point[1][1] = j;
				}
			}
		}
		
		int answer = bfs(cars, point);

		System.out.println("전체 맵");
		for (int i=0;i<cars.length;i++) {
			for (int j=0;j<cars[0].length;j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(answer);

	}
	
	public static int bfs(int[][] cars, int[][] point) {
		
		// 아직 미해결 (이미 지나간 곳은 체크하면서, 최소의 빨강차를 반환하는 방법 고민)
		
		// 1안 : 목적지까지 최소 거리 구한 다음, 그 거리 만큼 BFS 구현, 목적지에 도달하면서 지나는 빨강차 수 큐에 담음
		// 1. 목적지까지 최소 거리 구하기
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {point[0][0], point[0][1], 0});
		visited[point[0][0]][point[0][1]] = true;
		
		int red = 0;
		
		while (!q.isEmpty()) {
			int[] now = q.poll();
			int x = now[0];
			int y = now[1];
			
			if (x==point[1][0] && y==point[1][1]) {
				return red;
			}
			
			for (int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx>=0 && nx<cars.length && ny>=0 && ny<cars[0].length && cars[nx][ny]!=3) {
 				
				}
			}  
		}
		return -1; // 도 착점에 도달 x
	}
	

}
