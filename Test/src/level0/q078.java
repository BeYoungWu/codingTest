package level0;

public class q078 {

	public static void main(String[] args) {
		// 배열에서 문자열 대소문자 변환하기
		
		String[] strArr = {"aBc", "AbC"};
		
		String[] answer = new String[strArr.length];
		
		for (int i=0;i<strArr.length;i++) {
			if (i%2==1) {
				answer[i] = strArr[i].toUpperCase();
			} else {
				answer[i] = strArr[i].toLowerCase();
			}
		}

	}

}
