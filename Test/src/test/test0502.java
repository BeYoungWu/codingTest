package test;

public class test0502 {

	static boolean[][] visited;
	
	public static void main(String[] args) {
		String[] maps = { "--a-", "--d-", "b-c-", "---c" };
		String word = "abc";
		
		visited = new boolean[maps.length][maps[0].length()];
		
		dfs(maps, visited);
		
	}
	
	public static boolean[][] dfs(String[] maps, boolean[][] visited) {
		
		
		return visited;
	}

}
