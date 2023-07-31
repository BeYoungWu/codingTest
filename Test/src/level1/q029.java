package level1;

import java.util.Scanner;

public class q029 {

	public static void main(String[] args) {
		// 직사각형 별찍기
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0;i<b;i++) {
			String s = "";
			for(int j=0;j<a;j++) {
				s += "*";
			}
			System.out.println(s);
		}
		
	}

}
