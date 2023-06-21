package level0;

public class q23 {

	public static void main(String[] args) {
		// 점의 위치 구하기
		
		int[] dot = new int[2];
		
		int answer = 0;
		
		if (dot[0]<0) {
			if (dot[1]<0) {
				answer = 3;
			} else {
				answer = 2;
			}
		} else {
			if (dot[1]>0) {
				answer = 1;
			} else {
				answer = 4;
			}
		}

	}

}
