package level1;

import java.util.Scanner;

public class softeer01 {

	public static void main(String[] args) {
		// 주행거리 비교하기
		
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String s = (A > B) ? "A" : (A == B) ? "same" : "B";
        System.out.println(s);
        sc.close();
	}

}
