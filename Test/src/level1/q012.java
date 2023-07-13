package level1;

public class q012 {

	public static void main(String[] args) {
		// 하샤드 수
		
		int x = 10;
		
		boolean answer = true;
		
		String[] a = Integer.toString(x).split("");
		int sum = 0;
		for (int i=0;i<a.length;i++) {
			sum += Integer.parseInt(a[i]);
		}
		answer = (x%sum==0) ? true : false;
		

	}

}
