package test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Point{
	int x;
	int y;
	
	Point(int y, int x) {
		this.x = x;
		this.y = y;
	}
}

public class test0203 {

	static Queue<Point> qpoint = new LinkedList<>();
	
	static int[][] arr;
	static int[][] chkArr;
	
	public static void main(String[] args) {

		String[] maps = {"11001010","11010001","10001001","00001001"};

		int[] answer = {};
		
		int len1 = maps.length;
		int len2 = maps[0].length();
		arr = new int[len1][len2];
		chkArr = new int[len1][len2];
		
		for (int i=0;i<len1;i++) {
			String str = maps[i];
			for (int j=0;j<len2;j++) {
				arr[i][j] = Character.getNumericValue(str.charAt(j));
				System.out.print(Character.getNumericValue(str.charAt(j)));
				chkArr[i][j] = 0;
			}
			System.out.println();
		}

		Set<Integer> set = new HashSet<>();
		for (int i=0;i<len1;i++) {
			for (int j=0;j<len2;j++) {
				if (arr[i][j]==1 && chkArr[i][j]!=1) {
					int k = line(i, j);
					set.add(k);
				}
			}
		}
		System.out.println(set);
		System.out.println(answer);
		
	}
	
	public static int line(int a, int b) {
		int cnt = 0;
		
		qpoint.offer(new Point(a, b));
		chkArr[a][b] = 1;
		cnt++;
		while (!qpoint.isEmpty()) {
			Point tmp = qpoint.poll();
			
			if (tmp.y < arr.length-1) {
				if (arr[tmp.y+1][tmp.x]==1 && chkArr[tmp.y+1][tmp.x]!=1) { // 아래
					qpoint.offer(new Point(tmp.y+1, tmp.x));
					chkArr[tmp.y+1][tmp.x] = 1;
					cnt++;
				}
			}
			
			if (tmp.y > 0) {
				if (arr[tmp.y-1][tmp.x]==1 && chkArr[tmp.y-1][tmp.x]!=1) {
					qpoint.offer(new Point(tmp.y-1, tmp.x));
					chkArr[tmp.y-1][tmp.x] = 1;
					cnt++;
				}
			}
			
			if(tmp.x > 0) {
				if(arr[tmp.y][tmp.x-1] == 1 && chkArr[tmp.y][tmp.x-1] != 1) { // 좌
					qpoint.offer(new Point(tmp.y, tmp.x-1));
					chkArr[tmp.y][tmp.x-1] = 1;
					cnt++;
				}				
			}
			
			if(tmp.x < arr.length - 1) {
				if(arr[tmp.y][tmp.x+1] == 1 && chkArr[tmp.y][tmp.x+1] != 1) { // 우
					qpoint.offer(new Point(tmp.y, tmp.x+1));
					chkArr[tmp.y][tmp.x+1] = 1;
					cnt++;
				}				
			}
			
		}
		System.out.println(cnt);
		return cnt;
	}

}
