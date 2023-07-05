package level1;

public class q8 {

	public static void main(String[] args) {
		// 자연수 뒤집어 배열로 만들기
		
		long n = 12345;
		
		int[] answer = {};
		
		String a = "" + n;
		String[] b = a.split("");
		int[] c = new int[b.length];
		for (int i=0;i<b.length;i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		for (int i=0;i<c.length;i++) {
			answer[i] = c[c.length-1-i];
		}
		
		// 모범답안1
		answer = new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();

		// 모범답안2
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
	    sb = sb.reverse();
	    String[] ss = sb.toString().split("");
	    for (int i=0; i<ss.length; i++) {
	        answer[i] = Integer.parseInt(ss[i]);
	    }
		
	}

}
