package level2;

public class q011 {

	public static void main(String[] args) {
		// 카펫
		
		int brown = 10;
		int yellow = 2;
		
		int[] answer = new int[2];

		int a = brown + yellow;
		for (int i=3;i<a;i++) {
			int width = a/i;
			if (a % width == 0 && i>=3 && width>=i) {
				if ((i-2) * (width-2) == yellow) {
					answer[0] = width;
					answer[1] = i;
				}
			}
		}
		
	}

}
