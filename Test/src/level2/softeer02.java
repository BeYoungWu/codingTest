package level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class softeer02 {

	public static void main(String[] args) throws Exception {
		// 8단 변속기
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[8];
		for (int i=0;i<8;i++) {
			numbers[i] = sc.nextInt();
		}
		if (numbers[0]==1) {
			for (int i=1;i<8;i++) {
				if (numbers[i]!=numbers[i-1]+1) {
					System.out.println("mixed");
					break;
				} else if (i==7 && numbers[i]==numbers[i-1]+1) {
					System.out.println("ascending");
				}
			}
		} else if (numbers[0]==8) {
			for (int i=1;i<8;i++) {
				if (numbers[i]!=numbers[i-1]-1) {
					System.out.println("mixed");
					break;
				} else if (i==7 && numbers[i]==numbers[i-1]-1) {
					System.out.println("descending");
				}
			}
		} else {
			System.out.println("mixed");
		}
		
		// Scanner -> BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers2 = new int[8];
		for (int i=0;i<8;i++) {
			numbers2[i] = Integer.parseInt(st.nextToken());
		}

	}

}
