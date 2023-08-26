package level2;

public class q031 {

	static int answer = 0;
	
	public static void main(String[] args) {
		// 타겟 넘버
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		dfs(numbers, target, 0, 0);
		
		System.out.println(answer);
	}
	
	public static void dfs(int[] numbers, int target, int depth, int sum) {
		if (depth==numbers.length) {
			if (sum==target) {
				answer++;
			}
		} else {
			dfs(numbers, target, depth + 1, sum + numbers[depth]);
			dfs(numbers, target, depth + 1, sum - numbers[depth]);
		}
	}

}
