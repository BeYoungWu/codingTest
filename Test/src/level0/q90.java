package level0;

public class q90 {

	public static void main(String[] args) {
		// 공백으로 구분하기 2
		
		String my_string = "i  love you";
		String[] answer = my_string.split("");
		answer = answer.replaceAll(" ", "");

	}

}
