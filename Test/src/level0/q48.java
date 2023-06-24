package level0;

public class q48 {

	public static void main(String[] args) {
		// 부분 문자열인지 확인하기
		
		String my_string = "mona";
		String target = "on";
		
		int answer = 0;
		
		if (my_string.contains(target)) {
			answer = 1;
		} else {
			answer = 0;
		}

	}

}
