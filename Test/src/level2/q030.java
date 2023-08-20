package level2;

import java.util.LinkedList;
import java.util.Queue;

public class q030 {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static int[][] visited;
	
	public static void main(String[] args) {
		// 게임 맵 최단거리
		
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		visited = new int[maps.length][maps[0].length];
		visited[0][0] = 1;
		
		bfs(maps, visited);
		
		answer = visited[maps.length-1][maps[0].length-1];
		
		if (answer == 0) {
			answer = -1;
		}
	}
	
	static void bfs(int[][] maps, int[][] visited) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0});
		
		while (!q.isEmpty()) {
			int[] now = q.poll();
			int x = now[0];
			int y = now[1];
			
			for (int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx>=0 && nx<maps.length && ny>=0 && ny<maps[0].length && visited[nx][ny]==0 && maps[nx][ny]==1) {
					visited[nx][ny] = visited[x][y] + 1;
					q.add(new int[] {nx, ny});
				}
			}
		}
	}
}



