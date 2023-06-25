package level0;

public class q54 {

	public static void main(String[] args) {
		// 문자열의 뒤의 n글자
		
		String my_string = "MonaLeeSeungIn";
		int n = 5;
		
		String answer = "";
		
		int len = my_string.length();
		answer = my_string.substring(len-n, len);

	}

}
