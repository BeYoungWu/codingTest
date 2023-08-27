package level3;

public class q004 {

	public static void main(String[] args) {
		// 네트워크
		
		int n = 3;
		int[][] computers = {{1, 1, 0},{1, 1, 0},{0, 0, 1}};
		
		int answer = 0;

		boolean[] chk = new boolean[n];
		
		for (int i=0;i<n;i++) {
			if (!chk[i]) {
				dfs(computers, i, chk);
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	public static boolean[] dfs(int[][] computers, int i, boolean[] chk) {
		chk[i] = true;
		
		for (int j=0;j<computers.length;j++) {
			if (i!=j && computers[i][j]==1 && !chk[j]) {
				chk = dfs(computers, j, chk);
			}
		}
		return chk;
	}

}
