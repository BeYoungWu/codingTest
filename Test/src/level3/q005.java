package level3;

public class q005 {

	static boolean[] visited;
	static int answer = 0;
	
	public static void main(String[] args) {
		// 단어 변환
		
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

		visited = new boolean[words.length];
		dfs(begin, target, words, 0);
		
		System.out.println(answer);
		
	}
	
	public static void dfs(String begin, String target, String[] words, int cnt) {
		if (begin.equals(target)) {
			answer = cnt;
			return;
		}
		
		for (int i=0;i<words.length;i++) {
			if (visited[i]) {
				continue;
			}
			
			int k = 0;
			for (int j=0;j<begin.length();j++) {
				if (begin.charAt(j)==words[i].charAt(j)) {
					k++;
				}
			}
			
			if(k==begin.length()-1) {
				visited[i]=true;
				dfs(words[i], target, words, cnt + 1);
				visited[i]=false;
			}
			
		}
		
	}

}
