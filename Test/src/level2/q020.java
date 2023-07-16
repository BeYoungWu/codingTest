package level2;

import java.util.Arrays;

public class q020 {

	public static void main(String[] args) {
		// H-Index
		
		int[] citations = {3, 0, 6, 1, 5};
		
		int answer = 0;
		
		Arrays.sort(citations);
		for (int i=0;i<citations.length;i++) {
			int h = citations.length - i;
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}
		
	}

}
