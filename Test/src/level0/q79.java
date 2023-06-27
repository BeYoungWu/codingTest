package level0;

public class q79 {

	public static void main(String[] args) {
		// 원하는 문자열 찾기
		
		String myString = "msSIOfsjiMdmonadlkfjwoFJ";
		String pat = "mona";
		
		int answer = 0;
	
		myString = myString.toLowerCase();
		pat = pat.toLowerCase();
		
		answer = myString.contains(pat) ? 1 : 0;
		
		

	}

}
