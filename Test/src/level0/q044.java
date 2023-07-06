package level0;

public class q044 {

	public static void main(String[] args) {
		// 숨어있는 숫자의 덧셈 (1)
		
		String my_string = "aAb1B2cC34oOp";
		
		int answer = 0;
		
		String a = my_string.replaceAll("[^0-9]", "");
		for (int i=0;i<a.length();i++) {
			answer += Integer.parseInt(a.substring(i, i+1));
		}
		

	}

}
