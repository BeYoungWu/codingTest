package level1;

public class q027 {

	public static void main(String[] args) {
		// 문자열 다루기 기본
		
		String s = "a234";
		
		boolean answer = true;
		
		if (s.length()==4 || s.length()==6) {
			try {
				int a = Integer.parseInt(s);
//				return true;
			} catch(NumberFormatException e) {
//				return false;
			}
		} else {
//			return false;
		}

	}

}
