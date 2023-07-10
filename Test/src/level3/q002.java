package level3;

import java.util.Arrays;

public class q002 {

	public static void main(String[] args) {
		// 정수 삼각형
		
		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};

		int answer = 0;
		
		for (int i=1;i<triangle.length;i++) {
			for (int j=0;j<=i;j++) {
				if (j==0) {
					triangle[i][j] += triangle[i-1][j];
				} else if (j==i) {
					triangle[i][j] += triangle[i-1][j-1];
				} else {
					triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
				}
			}
		}
        Arrays.sort(triangle[triangle.length-1]);
        answer = triangle[triangle.length-1][triangle.length-1];
		
	}

}
