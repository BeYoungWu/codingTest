package level2;

public class q005 {

	public static void main(String[] args) {
		// 이진 변환 반복하기
		
		String s = "110010101001";
		
		int count = 0; 
		int zero = 0;
		int next = 0;
		
		while (s.length()>1) {
			for (int i=0;i<s.length();i++) {
				zero += s.charAt(i)=='0' ? 1 : 0; 
			}
			s = s.replaceAll("0", "");
			next = s.length();
			s = Integer.toBinaryString(next);
			count++;
		}
		
		int[] answer = {count, zero};

	}

}
