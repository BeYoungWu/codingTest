package level1;

import java.util.Arrays;

public class q020 {

	public static void main(String[] args) {
		// 제일 작은 수 제거하기
		
		int[] arr = {4, 3, 2, 1};
		
		if(arr.length == 1){
            int[] answer = {-1};
//            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }

	}

}
