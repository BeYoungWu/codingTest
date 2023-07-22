package level1;

public class q021 {

	public static void main(String[] args) {
		// 가운데 글자 가져오기
		
		String s = "abcde";
		
		String answer = "";
		
		int len = s.length();
		if (len > 2) {
            answer = (len%2==0) ? s.substring(len/2 - 1, len/2 + 1) : s.substring(len/2, len/2 + 1);
        } else {
            answer = s;
        }

	}

}
