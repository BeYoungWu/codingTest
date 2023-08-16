package level2;

public class q029 {

	public static void main(String[] args) {
		// 행렬 테두리 회전하기
		
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		int[] answer = new int[queries.length];
		int minimalsIdx = 0;
		
		int[][] square = new int[rows][columns];
		int num = 1;
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				square[i][j] = num;
				num++;
			}
		}
		
		for (int[] query : queries) {
			int x1 = query[0] - 1;
			int y1 = query[1] - 1;
			int x2 = query[2] - 1;
			int y2 = query[3] - 1;
			int firstNum = square[x1][y2];
			int min = firstNum;
			
			// 숫자를 우로 이동 (상단)
			for (int i=y2-1;i>=y1;i--) {
				min = Math.min(min, square[x1][i]);
				square[x1][i+1] = square[x1][i];
			}
			
			// 숫자를 위로 이동 (좌측)
			for (int i=x1+1;i<=x2;i++) {
				min = Math.min(min, square[i][y1]);
				square[i-1][y1] = square[i][y1];
			}

			// 숫자를 좌로 이동 (하단)
			for (int i=y1+1;i<=y2;i++) {
				min = Math.min(min, square[x2][i]);
				square[x2][i-1] = square[x2][i];
			}
			
			// 숫자를 아래로 이동 (우측)
			for (int i=x2-1;i>=x1;i--) {
				min = Math.min(min, square[i][y2]);
				square[i+1][y2] = square[i][y2];
			}
			
			square[x1+1][y2] = firstNum;
			answer[minimalsIdx] = min;
			minimalsIdx++;
		}
		
		for (int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
