package level0;

import java.util.Arrays;

public class q28 {

	public static void main(String[] args) {
		// 삼각형의 완성조건 (1)
		
		int[] sides = {3, 6, 2};
		
		int answer = 0;
		
		Arrays.sort(sides);
		if (sides[2]<sides[0]+sides[1]) {
			answer = 1;
		} else {
			answer = 2;
		}
	}

}
