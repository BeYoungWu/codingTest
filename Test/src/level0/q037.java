package level0;

public class q037 {

	public static void main(String[] args) {
		// 문자 반복 출력하기
		
		String my_string = "mona";
		int n = 3;
		
		String answer = "";
		
		for (int i=0;i<my_string.length();i++) {
			answer += my_string.substring(i,i+1).repeat(n);
		}
		
	}

}
