package level0;

public class q61 {

	public static void main(String[] args) {
		// 문자열 정수의 합
		
		String num_str = "1234567";
		
		int answer = 0;
		
		String[] a = num_str.split("");
		
		for (int i=0;i<num_str.length();i++) {
			answer += Integer.parseInt(a[i]);
		}

	}

}
