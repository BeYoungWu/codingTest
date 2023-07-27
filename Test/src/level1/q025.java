package level1;

import java.util.Arrays;
import java.util.Collections;

public class q025 {

	public static void main(String[] args) {
		// 문자열 내림차순으로 배치하기
		
		String s = "Zbcdefg";
		
		String answer = "";
		
		String[] split = s.split("");
		Arrays.sort(split, Collections.reverseOrder());
		for (int i=0;i<split.length;i++) {
			answer += split[i];
		}
		
	}

}
