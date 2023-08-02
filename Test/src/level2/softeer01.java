package level2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class softeer01 {

	public static void main(String[] args) {
		// 금고털이
		
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		Set<Integer> set = new HashSet<>();
		for (int i=0;i<N;i++) {
			int weight = sc.nextInt();
			int num = sc.nextInt();
			for (int j=0;j<num;j++) {
				sum += weight;
				if (sum>W) {
					sum -= weight;
				}
			}
		}
		System.out.println(sum);
		
		

	}

}
