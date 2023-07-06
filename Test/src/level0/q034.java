package level0;

public class q034 {

	public static void main(String[] args) {
		// 특정 문자 제거하기
		
		String my_string = "abcdef";
		String letter = "f";
		
		String answer = "";
		
		answer = my_string.replaceAll(letter, "");

	}

}
