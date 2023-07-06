package level0;

public class q051 {

	public static void main(String[] args) {
		// 배열 만들기 1
		
		int n = 10;
		int k = 3;
		
		int[] answer = new int[n/k];
		
		int index = 1;
		int i = 0;
		while (index<=n) {
			if (index%k==0) {
				answer[i] = index;
				i++;
			}
			index++;
		}

	}

}
