package level2;

import java.util.Arrays;

public class q001 {

	public static void main(String[] args) {
		// 최댓값과 최솟값
		
		String s = "-1 -2 -3 -4";
		
		String answer = "";
		
		String[] a = s.split(" ");
		int[] b = new int[a.length];
		for (int i=0;i<b.length;i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		Arrays.sort(b);
		answer = b[0] + " " + b[b.length-1];
		
	}

}
