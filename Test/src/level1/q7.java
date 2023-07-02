package level1;

public class q7 {

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		
		String s = "pPoooyY";
		
		boolean answer = true;
		
		String[] ss = s.toLowerCase().split("");
		int p = 0;
		int y = 0;
		
		for (int i=0;i<ss.length;i++) {
			p += ss[i].equals("p") ? 1 : 0;
			y += ss[i].equals("y") ? 1 : 0;
		}
		answer = (p==y) ? true : false;
		
		// 다른 답안
		s = s.toUpperCase();
		answer = s.chars().filter( e -> 'P' == e).count() == s.chars().filter( e -> 'Y' == e).count();
		
	}

}
