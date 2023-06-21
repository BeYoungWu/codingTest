package level0;

public class q21 {

	public static void main(String[] args) {
		// 배열 뒤집기

		int[] num_list = {1, 2, 3, 4, 5};
		
		int[] answer = new int[num_list.length];
		
        for (int i=0;i<num_list.length;i++) {
			answer[i] = num_list[num_list.length-(i+1)];
		}
		
		
	}

}
