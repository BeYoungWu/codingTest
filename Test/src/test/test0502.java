package test;

import java.util.LinkedList;
import java.util.Queue;

class Distance {
	int x;
	int y;
	Distance(int y,int x) {
		this.y = y;
		this.x = x;
	}
}

public class test0502 {

	static Queue<Distance> qpoint = new LinkedList<>();
	static String[][] arr;
	static int[][] chkArr;
	static int[][] positions;
	
	public static void main(String[] args) {
		int answer = 0;
		
		String[] maps = {};
		String word = "";
		
		int n = maps.length;
		
		String[] words = word.split("");
		arr = new String[n][n];
		chkArr = new int[n][n];
		positions = new int[n][2];
		
		int idx = 0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				String str = Character.toString(maps[i].charAt(j));
				arr[i][j] = str;
				chkArr[i][j] = 0;
				for (int k=0;k<word.length();k++) {
					if (str.equals(words[k])) {
						positions[idx][0] = i;
						positions[idx][1] = j;
						idx++;
					}
				}
			}
		}
		
		answer = distance(0,0,positions,words);
		
		System.out.println(answer);
	}
	
	public static int distance(int a, int b, int[][] positions, String[] words) {
		int cnt = 0;
		qpoint.offer(new Distance(a,b));
		chkArr[a][b] = 1;
		while (!qpoint.isEmpty()) {
			Distance tmp = qpoint.poll();
			
			if (tmp.y < arr.length-1) {
				for (int i=0;i<words.length;i++) {
					if (arr[tmp.y+1][tmp.x].equals(words[i]) && chkArr[tmp.y+1][tmp.x]!=1) {
						qpoint.offer(new Distance(tmp.y+1, tmp.x));
						chkArr[tmp.y+1][tmp.x] = 1;
						cnt++;
					}
				}
				
			}
			
			if (tmp.y > 0) {
				for (int i=0;i<words.length;i++) {
					if (arr[tmp.y-1][tmp.x].equals(words[i]) && chkArr[tmp.y-1][tmp.x]!=1) {
						qpoint.offer(new Distance(tmp.y-1, tmp.x));
						chkArr[tmp.y-1][tmp.x] = 1;
						cnt++;
					}
				}
			}
			
			if(tmp.x > 0) {
				for (int i=0;i<words.length;i++) {
					if(arr[tmp.y][tmp.x-1].equals(words[i]) && chkArr[tmp.y][tmp.x-1] != 1) {
						qpoint.offer(new Distance(tmp.y, tmp.x-1));
						chkArr[tmp.y][tmp.x-1] = 1;
						cnt++;
					}
				}
			}
			
			if(tmp.x < arr.length - 1) {
				for (int i=0;i<words.length;i++) {
					if(arr[tmp.y][tmp.x+1].equals(words[i]) && chkArr[tmp.y][tmp.x+1] != 1) {
						qpoint.offer(new Distance(tmp.y, tmp.x+1));
						chkArr[tmp.y][tmp.x+1] = 1;
						cnt++;
					}
				}
			}
			
		}
		return cnt;
	}
	

}
