package level1;

public class q013 {

	public static void main(String[] args) {
		// 두 정수 사이의 합
		
		int a = 3;
		int b = 5;
		
		long answer = 0;
		
		if (a!=b) {
            if (a<b) {
                for (int i=a;i<=b;i++) {
                    answer += i;
                }
            } else {
                for (int i=b;i<=a;i++) {
                    answer += i;
                }
            }
		} else {
			answer = a;
		}

	}

}
