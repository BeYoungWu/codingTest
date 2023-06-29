package level2;

public class q3 {

	public static void main(String[] args) {
		// 올바른 괄호
		
		String s = "()()";
		
		boolean answer = true;
		
		int a = 0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				a++;
			} else {
				a--;
			}
			if (a<0) {
				answer = false;
				break;
			}
		}
		if (a!=0 || s.length()==0) {
			answer = false;
		}
		
	}

}
