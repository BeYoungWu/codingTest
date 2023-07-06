package level0;

public class q067 {

	public static void main(String[] args) {
		// 원소들의 곱과 합
		
		int[] num_list = {5, 7, 8, 3};
		
		int answer = 0;
		
		int a = 1;
		for (int i=0;i<num_list.length;i++) {
			a *= num_list[i];
		}
		
		int b = 0;
		for (int i=0;i<num_list.length;i++) {
			b += num_list[i];
		}
		
		answer = (a < b*b) ? 1 : 0;

	}

}
