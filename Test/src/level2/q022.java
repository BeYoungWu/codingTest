package level2;

public class q022 {

	public static void main(String[] args) {
		// 행렬의 곱셈
		
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		
		int len1 = arr1.length;
		int len2 = arr2[0].length;
		int len3 = arr1[0].length;
		
		int[][] answer = new int[len1][len2];
		
		for (int i=0;i<len1;i++) {
			for (int j=0;j<len2;j++) {
				for (int k=0;k<len3;k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
	}

}
