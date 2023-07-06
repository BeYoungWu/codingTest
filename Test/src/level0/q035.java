package level0;

public class q035 {

	public static void main(String[] args) {
		// 문자열 뒤집기

		String my_string = "mona";
		
		String answer = "";
		
		StringBuffer sb = new StringBuffer(my_string);
		answer = sb.reverse().toString();
		
	}

}
