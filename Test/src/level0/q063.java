package level0;

public class q063 {

	public static void main(String[] args) {
		// 카운트 다운
		
		int start = 10;
		int end = 3;
		
		int[] answer = new int[start-end+1];
		
		int index = start;
		for (int i=0;i<start-end+1;i++) {
			answer[i] = index;
			index--;
		}
		
		// 모범답안
		for (int i=0;i<start-end+1;i++) {
			answer[i] = start - i;
		}
		
	}

}
