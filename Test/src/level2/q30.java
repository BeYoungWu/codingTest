package level2;

public class q30 {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static int[][] visited;
	
	public static void main(String[] args) {
		// 게임 맵 최단거리
		
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int answer = 0;
		
		visited = new int[maps.length][maps[0].length];
		for (int i=0;i<maps.length;i++) {
			for (int j=0;j<maps[0].length;j++) {
				visited[i][j] = 0;
			}
		}
		
		bfs(maps, visited);
		
		answer = visited[maps.length-1][maps[0].length];
		
		if (answer == 0) {
			answer = -1;
		}
	}
	
	static void bfs(int[][] maps, int[][] visited) {
		
		
	}

}
