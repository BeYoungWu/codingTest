package test;

public class test0102 {

	static int[][] square;
	
	public static void main(String[] args) {

		int rows = 4;
		int columns = 4;
		int[][] swipes = {{3,2,2,3,4},{1,1,3,4,4}};
		
		int[] answer = new int[swipes.length];
		int idx = 0;
		
		square = new int[rows][columns];
		int num = 1;
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				square[i][j] = num;
				num++;
			}
		}
		
		for (int[] swipe : swipes) {
			int d = swipe[0];
			int r1 = swipe[1] - 1;
			int c1 = swipe[2] - 1;
			int r2 = swipe[3] - 1;
			int c2 = swipe[4] - 1;
			int sum = 0;
			
			switch (d) {
				case 1: // 아래로 스와이프
					for (int i=c1;i<=c2;i++) {
						sum += square[r2][i];
					}
					down(r1,c1,r2,c2);
					break;
				case 2: // 위로 스와이프
					for (int i=c1;i<=c2;i++) {
						sum += square[r1][i];
					}
					up(r1,c1,r2,c2);
					break;
				case 3: // 우로 스와이프
					for (int i=r1;i<=r2;i++) {
						sum += square[i][c2];
					}
					right(r1,c1,r2,c2);
					break;
				case 4: // 좌로 스와이프
					for (int i=r1;i<=r2;i++) {
						sum += square[i][c1];
					}
					left(r1,c1,r2,c2);
					break;
			}
			
			answer[idx] = sum;
			idx++;
		}

		for (int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static void down(int r1, int c1, int r2, int c2) {
		for (int i=c1;i<=c2;i++) {
			int savedNum = square[r2][i];
			for (int j=r2-1;j>=r1;j--) {
				square[j+1][i] = square[j][i];
			}
			square[r1][i] = savedNum;
		}
	}
	
	public static void up(int r1, int c1, int r2, int c2) {
		for (int i=c1;i<=c2;i++) {
			int savedNum = square[r1][i];
			for (int j=r1+1;j<=r2;j++) {
				square[j-1][i] = square[j][i];
			}
			square[r2][i] = savedNum;
		}
	}
	
	public static void right(int r1, int c1, int r2, int c2) {
		for (int i=r1;i<=r2;i++) {
			int savedNum = square[i][c2];
			for (int j=c2-1;j>=c1;j--) {
				square[i][j+1] = square[i][j];
			}
			square[i][c1] = savedNum;
		}
	}
	
	public static void left(int r1, int c1, int r2, int c2) {
		for (int i=r1;i<=r2;i++) {
			int savedNum = square[i][c1];
			for (int j=c1+1;j<=c2;j++) {
				square[i][j-1] = square[i][j];
			}
			square[i][c2] = savedNum;
		}
	}

}
