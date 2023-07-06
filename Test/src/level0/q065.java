package level0;

public class q065 {

	public static void main(String[] args) {
		// 카운트 업
		
		int start = 3;
		int end = 10;
		
		int[] answer = new int[end-start+1];
		
		for (int i=0;i<end-start+1;i++) {
			answer[i] = start + i;
		}

	}

}
