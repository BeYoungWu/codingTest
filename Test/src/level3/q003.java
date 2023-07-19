package level3;

public class q003 {

	public static void main(String[] args) {
		// 최고의 집합
		
		int n = 2;
		int s = 9;
		
		int[] answer;
		
		if (n>s) {
			answer = new int[]{-1};
//			return answer;
		}
		
		answer = new int[n];
		for (int i=0;i<n;i++) {
			answer[i] = s/n;
		}
		
		int idx = n - 1;
		for (int i=0;i<s%n;i++) {
			answer[idx]++;
			idx--;
		}
		

	}

}
