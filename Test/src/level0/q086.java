package level0;

public class q086 {

	public static void main(String[] args) {
		// 홀수 vs 짝수
		
		int[] num_list = {4, 2, 6, 1, 7, 6};
		
		int answer = 0;
		
		int odd = 0;
		int even = 0;
		
		for (int i=0;i<num_list.length;i++) {
			if ((i+1)%2==0) {
				even += num_list[i];
			} else {
				odd += num_list[i];
			}
		}
		
		answer = (odd>=even) ? odd : even; 

	}

}
