package level0;

public class q29 {

	public static void main(String[] args) {
		// 짝수 홀수 개수
		
		int[] num_list = {1, 2, 3, 4, 5};
		
		int[] answer = {0, 0};
		
		for (int i=0;i<num_list.length;i++) {
			if(num_list[i]%2==0) {
				answer[0] += 1;
			} else {
				answer[1] += 1;
			}
		}

	}

}
