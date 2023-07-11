package level2;

public class q016 {

	public static void main(String[] args) {
		// 멀리 뛰기
		
		int n = 4;
		
		long answer = 0;
		
		long[] arr = new long[2001];
		
		arr[1] = 1;
		arr[2] = 2;
		for (int i=3;i<2001; i++) {
			arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
		}
				
		answer = arr[n];
		
	}

}
