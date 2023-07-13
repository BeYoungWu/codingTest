package level1;

import java.util.Arrays;
import java.util.Collections;

public class q011 {

	public static void main(String[] args) {
		// 정수 내림차순으로 배치하기
		
		long n = 118372;
		
		long answer = 0;
		
		String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String a = "";
        
        for(String s : str)
           a += s;
        
        answer = Long.parseLong(a);
        

	}

}
