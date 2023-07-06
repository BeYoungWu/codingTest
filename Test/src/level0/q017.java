package level0;

public class q017 {

	public static void main(String[] args) {
		// 각도기
		
		int angle = 90;
		
		int answer = 0;
		
		if (0 < angle && angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (90 < angle && angle < 180) {
			answer = 3;
		} else if (angle == 180) {
			answer = 4;
		}

	}

}
