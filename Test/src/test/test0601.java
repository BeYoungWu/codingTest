package test;

import java.util.Arrays;

public class test0601 {

	public static void main(String[] args) {
		int[][] score = {};
		
		int len1 = score.length;
		int len2 = score[0].length;
		
		int[] answer = new int[len1];
		
		for (int i=0;i<len1;i++) {
			Arrays.sort(score[i]);
		}
		
		int idx = 0;
		for (int i=0;i<len1;i++) {
			float sum = 0;
			for (int j=1;j<len2-1;j++) {
				sum += score[i][j];
			}
			sum = sum/(len2-2);
			if (sum>900) {
				answer[idx] = 1;
			} else if (sum>800 && sum<=900) {
				answer[idx] = 2;
			} else if (sum>700 && sum<=800) {
				answer[idx] = 3;
			} else if (sum>600 && sum<=700) {
				answer[idx] = 4;
			} else if (sum>500 && sum<=600) {
				answer[idx] = 5;
			} else if (sum>400 && sum<=500) {
				answer[idx] = 6;
			} else if (sum>300 && sum<=400) {
				answer[idx] = 7;
			} else if (sum>200 && sum<=300) {
				answer[idx] = 8;
			} else {
				answer[idx] = 9;
			}
			idx++;
		}
		
		for (int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}

	}

}











