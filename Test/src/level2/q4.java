package level2;

import java.util.Arrays;

public class q4 {

	public static void main(String[] args) {
		// 최솟값 만들기
		
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		int answer = 0;
		
		Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i <A.length; i++)
        {
            answer += A[i] * B[A.length-i-1];
        }
        
        // PriorityQueue가 sort 보다 효율적

	}

}
