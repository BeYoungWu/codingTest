package level0;

public class q056 {

	public static void main(String[] args) {
		// 정수 찾기
		
		int[] num_list = {1, 2, 3, 4, 5};
		int n = 3;
		
		int answer = 0;
		
		for (int i=0;i<num_list.length;i++) {
			if(num_list[i]==n) {
				answer = 1;
			}
		}

	}

}
