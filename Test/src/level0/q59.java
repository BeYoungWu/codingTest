package level0;

public class q59 {

	public static void main(String[] args) {
		// 마지막 두 원소
		
		int[] num_list = {2, 1, 6};
		
		int len = num_list.length;
		int[] answer = new int[len+1];
		
		for (int i=0;i<len;i++) {
			answer[i] = num_list[i];
		}
		
		int a = num_list[len-1];
		int b = num_list[len-2];
		answer[len] = a > b ? a-b : 2*a;

	}

}
