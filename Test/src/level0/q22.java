package level0;

public class q22 {

	public static void main(String[] args) {
		// 배열 원소의 길이
		
		String[] strlist = new String[4];
		
		int[] answer = new int[strlist.length];
		
		for (int i=0;i<strlist.length;i++) {
			answer[i] = strlist[i].length();
		}

	}

}
