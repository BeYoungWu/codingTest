package level2;

public class q2 {

	public static void main(String[] args) {
		// JadenCase 문자열 만들기
		
		String s = "3people unFollowed me";
		
		String answer = "";
		
		String[] a = s.split(" ");
		for (int i=0;i<a.length;i++) {
			if (a[i].length()==0) {
				answer += " ";
			} else {
				a[i] = a[i].substring(0,1).toUpperCase() + a[i].substring(1,a[i].length()).toLowerCase();
				answer += a[i];
			}
			if (i!=a.length-1) {
				answer += " ";
			}
		}

	}

}
