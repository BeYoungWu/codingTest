package level1;

public class q022 {

	public static void main(String[] args) {
		// 수박수박수박수박수박수?
		
		int n = 1;
		
		String answer = "";
		
		for (int i=0;i<n/2;i++) {
			answer += "수박";
		}
		if (n%2!=0) {
			answer += "수";
		}

	}

}
