package level1;

public class q014 {

	public static void main(String[] args) {
		// 콜라츠 추측
		
		int num = 6;
		
		int answer = 0;
		
		while (num != 1) {
			if (num%2==0) {
				num /= 2;
				answer++;
			} else {
				num = (3*num) + 1;
				answer++;
			}
			
			if (answer >= 500) {
				answer = -1;
				break;
			}
		}

	}

}
