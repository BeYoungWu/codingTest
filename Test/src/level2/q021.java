package level2;

public class q021 {

	public static void main(String[] args) {
		// n^2 배열 자르기
		
		int n = 3;
		long left = 2;
		long right = 5;
		
		int len = (int)(right - left);
		int[] answer = new int[len+1];
		
        int idx = 0;
		for (long i=left;i<=right;i++) {
			long a = i/n;
			long b = i%n;
			answer[idx] = Math.max((int)a, (int)b) + 1;
            idx++;
		}
		
	}

}
