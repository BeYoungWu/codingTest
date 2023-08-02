package level1;

import java.util.Scanner;

public class softeer02 {

	public static void main(String[] args) {
		// 근무 시간
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i=0;i<5;i++) {
            String[] start =  sc.next().split(":");
            String[] end = sc.next().split(":");
            int s = Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]);
            int e = Integer.parseInt(end[0])*60 + Integer.parseInt(end[1]);
            sum += e - s;
        }
		System.out.println(sum);
		sc.close();

	}

}
