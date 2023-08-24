package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class test0401 {
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static Queue<int[]> q = new LinkedList<>();
	static PriorityQueue<Integer> red = new PriorityQueue<>();
	
	static int[][] cars;
	static boolean[][] visited;
	static boolean[][] visited2;
	
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[][] cars = new int[7][7];
		int[][] cars = {{0,0,0,3,0,3,3},{0,1,0,3,0,3,3},{0,0,0,0,0,3,3},{3,2,2,2,0,3,3},{3,0,0,0,2,0,2},{3,0,2,0,0,4,0},{3,0,0,0,2,0,0}};
		visited = new boolean[7][7];
		visited2 = new boolean[7][7];
		
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
		
		int distance = getDistance(point);

		int answer = 0;
		
		if (distance == -1) {
			answer = -1;
//			return -1;
		}
		
		// 빨강차 구하기
		q.offer(new int[] {point[0][0],point[0][1],0});
		visited2[point[0][0]][point[0][1]] = true;
		
		int[] now = q.poll();
		int x = now[0];
		int y = now[1];
		int d = now[2];
		
		answer = getRed(point, distance);
		
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
	
	public static int getDistance(int[][] point) {
		
		// 아직 미해결 (이미 지나간 곳은 체크하면서, 최소의 빨강차를 반환하는 방법 고민)
		
		// 1안 : 목적지까지 최소 거리 구한 다음, 그 거리 만큼 BFS 구현, 목적지에 도달하면서 지나는 빨강차 수 큐에 담음
		// 1. 목적지까지 최소 거리 구하기
		q.offer(new int[] {point[0][0],point[0][1],0});
		visited[point[0][0]][point[0][1]] = true;
		
		while (!q.isEmpty()) {
			int[] now = q.poll();
			int x = now[0];
			int y = now[1];
			int distance = now[2];
			
			if (x==point[1][0] && y==point[1][1]) {
				return distance;
			}
			
			for (int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx>=0 && nx<cars.length && ny>=0 && ny<cars[0].length && cars[nx][ny]!=3 && !visited[nx][ny]) {
					q.offer(new int[] {nx, ny, distance + 1});
					visited[nx][ny] = true;
				}
			}
		}
		return -1; // 도 착점에 도달 x
	}
	
	public static int getRed(int[][] point, int distance) {
		// 최소 거리로 목적지를 도달하면서 지나는 빨강차 수 구하기
		int x = point[0][0];
		int y = point[0][1];
		
		for (int i=0;i<distance;i++) {
			for (int j=0;j<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx>=0 && nx<cars.length && ny>=0 && ny<cars[0].length && cars[nx][ny]!=3 && !visited2[nx][ny]) {
					bfs(nx, ny, 0, distance, 0);
				}
			}
		}
		
		int minRed = red.poll();
		
		return minRed;
	}
	
	public static void bfs(int x, int y, int d, int distance, int depth) {
		if (depth == distance) {
			
		}
			
	}

}
