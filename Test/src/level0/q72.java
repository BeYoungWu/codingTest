package level0;

public class q72 {

	public static void main(String[] args) {
		// 문자열 곱하기
		
		String my_string = "mona";
		int k = 3;
		
		String answer = "";
		
		for (int i=0;i<k;i++) {
			answer += my_string;
		}
		
		// 모범답안
		answer = my_string.repeat(k);

	}

}
