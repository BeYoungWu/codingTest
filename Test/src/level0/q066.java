package level0;

public class q066 {

	public static void main(String[] args) {
		// 특정한 문자를 대문자로 바꾸기
		
		String my_string = "mona";
		String alp = "m";
		
		String answer = "";
		
		String[] a = my_string.split("");
		
		for (int i=0;i<my_string.length();i++) {
			if (a[i].equals(alp)) {
				a[i] = a[i].toUpperCase();
			}
			answer += a[i];
		}
		
		// 모범답안
		answer = my_string.replaceAll(alp, alp.toUpperCase());

	}

}
