package level0;

public class q46 {

	public static void main(String[] args) {
		// n개 간격의 원소들
		
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		
		int[] answer;
		
		if (num_list.length % n == 0) {
			answer = new int[num_list.length/n];
		} else {
			answer = new int[num_list.length/n + 1];
		}
		
		int a = 0;
		for (int i=0;i<num_list.length;i+=n) {
			answer[a] = num_list[i];
			a++;
		}
		
	}

}
