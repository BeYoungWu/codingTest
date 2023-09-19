package test;

public class test0702 {

	public static void main(String[] args) {
		int n = 4;
		
		int answer = 0;
		
		for (int i=0;i<n;i++) {
			for (int j=1;j<n;j++) {
				if ((i+j) < n) {
					answer += Math.pow((n-(i+j)), 2);
				}
			}
		}

		System.out.println(answer);
		
	}

}
