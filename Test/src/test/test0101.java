package test;

public class test0101 {

	public static void main(String[] args) {
		
		String[] algorithms = {"bfs", "dfs", "sort"};
		long n = 8;
		
		long answer = 0;
		
		for (int i=0;i<algorithms.length;i++) {
			if (n%algorithms[i].length() == 0) {
				answer += n/algorithms[i].length();
			} else {
				answer += n/algorithms[i].length() + 1;
			}
		}

		System.out.println(answer);

	}

}
