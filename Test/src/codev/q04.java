package codev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q04 {

	public static void main(String[] args) throws IOException{
		// Programmer String
		int answer = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split("");

		String[] chk = {"p","r","o","g","r","a","m","m","e","r"};
		
		boolean loop = false; // 앞단어 완성 여부
		int idx = 0;
		for (int i=0;i<str.length;i++) {
			// 앞단어 완성 상태
			if (loop && !str[i].equals("p")) { // 뒷 단어 시작점 나올때 까지
				answer++;
			}
			if (loop && str[i].equals("p")) {
				break;
			}
			
			// 앞단어 미완성 상태
			if (!loop) {
				if (str[i].equals(chk[idx])) {
					idx++;
					if (idx==10) {
						loop = true;
					}
				}
			}			
		}
		
		System.out.print(answer);
		
	}

	
}
