package level0;

import java.util.Scanner;

public class q68 {

	public static void main(String[] args) {
		// 홀짝 구분하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%2==0) {
			System.out.println(n+" is even");
		} else {
			System.out.println(n+" is odd");
		}

	}

}
