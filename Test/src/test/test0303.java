package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Now {
	int x;
	int y;
	
	Now(int y,int x) {
		this.y = y;
		this.x = x;
	}
}

public class test0303 {

	static Queue<Now> qnow = new LinkedList<>();
	
	static String[][] arr1;
	static String[][] arr2;
	static String[][] arr3;
	static int[][] chkArr1;
	static int[][] chkArr2;
	static int[][] chkArr3;
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		for (int i=0;i<M;i++) {
			String str = br.readLine();
			for (int j=0;j<N;j++) {
				String s = Character.toString(str.charAt(j));
				arr1[i][j] = s.equals("R") ? "R" : "X";
				arr2[i][j] = s.equals("G") ? "G" : "X";
				arr3[i][j] = s.equals("B") ? "B" : "X";
				chkArr1[i][j] = 0;
				chkArr2[i][j] = 0;
				chkArr3[i][j] = 0;
			}
		}
		
		list = new ArrayList<>();
		int[] num = new int[3];
		for (int i=0;i<M;i++) {
			for (int j=0;j<N;j++) {
				if (chkArr1[i][j]!=1) {
					int k = area1(i,j);
					list.add(k);
				}
			}
		}
		num[0] = list.size();
		
		list = new ArrayList<>();
		for (int i=0;i<M;i++) {
			for (int j=0;j<N;j++) {
				if (chkArr2[i][j]!=1) {
					int k = area2(i,j);
					list.add(k);
				}
			}
		}
		num[1] = list.size();
		
		list = new ArrayList<>();
		for (int i=0;i<M;i++) {
			for (int j=0;j<N;j++) {
				if (chkArr3[i][j]!=1) {
					int k = area3(i,j);
					list.add(k);
				}
			}
		}
		num[2] = list.size();
		
		if (num[0]>=num[1]) {
			if (num[0]>=num[2]) {
				System.out.println("G B");
				System.out.println(num[0]);
			} else {
				System.out.println("R G");
				System.out.println(num[2]);
			}
		} else {
			if (num[1]>=num[2]) {
				System.out.println("R B");
				System.out.println(num[1]);
			} else {
				System.out.println("R G");
				System.out.println(num[2]);
			}
		}
	}
	
	public static int area1(int a, int b) {
		int count = 0;
		qnow.offer(new Now(a,b));
		chkArr1[a][b] = 1;
		count++;
		
		while (!qnow.isEmpty()) {
			Now tmp = qnow.poll();
			if (tmp.y > 0) {
				if (arr1[tmp.y-1][tmp.x].equals(arr1[tmp.y][tmp.x]) && chkArr1[tmp.y-1][tmp.x]!=1) {
					qnow.offer(new Now(tmp.y-1,tmp.x));
					chkArr1[tmp.y-1][tmp.x] = 1;
					count++;
				}
			}
			if (tmp.y < arr1.length-1) {
				if (arr1[tmp.y+1][tmp.x].equals(arr1[tmp.y][tmp.x]) && chkArr1[tmp.y+1][tmp.x]!=1) {
					qnow.offer(new Now(tmp.y+1,tmp.x));
					chkArr1[tmp.y+1][tmp.x] = 1;
					count++;
				}
			}
			if (tmp.x > 0) {
				if (arr1[tmp.y][tmp.x-1].equals(arr1[tmp.y][tmp.x]) && chkArr1[tmp.y][tmp.x-1]!=1) {
					qnow.offer(new Now(tmp.y,tmp.x-1));
					chkArr1[tmp.y][tmp.x-1] = 1;
					count++;
				}
			}
			if (tmp.x < arr1[0].length-1) {
				if (arr1[tmp.y][tmp.x+1].equals(arr1[tmp.y][tmp.x]) && chkArr1[tmp.y][tmp.x+1]!=1) {
					qnow.offer(new Now(tmp.y,tmp.x+1));
					chkArr1[tmp.y][tmp.x+1] = 1;
					count++;
				}
			}
		}
		return count;
	}
	
	public static int area2(int a, int b) {
		int count = 0;
		qnow.offer(new Now(a,b));
		chkArr2[a][b] = 1;
		count++;
		
		while (!qnow.isEmpty()) {
			Now tmp = qnow.poll();
			if (tmp.y > 0) {
				if (arr2[tmp.y-1][tmp.x].equals(arr1[tmp.y][tmp.x]) && chkArr2[tmp.y-1][tmp.x]!=1) {
					qnow.offer(new Now(tmp.y-1,tmp.x));
					chkArr2[tmp.y-1][tmp.x] = 1;
					count++;
				}
			}
			if (tmp.y < arr2.length-1) {
				if (arr2[tmp.y+1][tmp.x].equals(arr2[tmp.y][tmp.x]) && chkArr2[tmp.y+1][tmp.x]!=1) {
					qnow.offer(new Now(tmp.y+1,tmp.x));
					chkArr2[tmp.y+1][tmp.x] = 1;
					count++;
				}
			}
			if (tmp.x > 0) {
				if (arr2[tmp.y][tmp.x-1].equals(arr2[tmp.y][tmp.x]) && chkArr2[tmp.y][tmp.x-1]!=1) {
					qnow.offer(new Now(tmp.y,tmp.x-1));
					chkArr2[tmp.y][tmp.x-1] = 1;
					count++;
				}
			}
			if (tmp.x < arr2[0].length-1) {
				if (arr2[tmp.y][tmp.x+1].equals(arr2[tmp.y][tmp.x]) && chkArr2[tmp.y][tmp.x+1]!=1) {
					qnow.offer(new Now(tmp.y,tmp.x+1));
					chkArr2[tmp.y][tmp.x+1] = 1;
					count++;
				}
			}
		}
		return count;
	}
	
	public static int area3(int a, int b) {
		int count = 0;
		qnow.offer(new Now(a,b));
		chkArr3[a][b] = 1;
		count++;
		
		while (!qnow.isEmpty()) {
			Now tmp = qnow.poll();
			if (tmp.y > 0) {
				if (arr3[tmp.y-1][tmp.x].equals(arr3[tmp.y][tmp.x]) && chkArr3[tmp.y-1][tmp.x]!=1) {
					qnow.offer(new Now(tmp.y-1,tmp.x));
					chkArr3[tmp.y-1][tmp.x] = 1;
					count++;
				}
			}
			if (tmp.y < arr3.length-1) {
				if (arr3[tmp.y+1][tmp.x].equals(arr3[tmp.y][tmp.x]) && chkArr3[tmp.y+1][tmp.x]!=1) {
					qnow.offer(new Now(tmp.y+1,tmp.x));
					chkArr3[tmp.y+1][tmp.x] = 1;
					count++;
				}
			}
			if (tmp.x > 0) {
				if (arr3[tmp.y][tmp.x-1].equals(arr3[tmp.y][tmp.x]) && chkArr3[tmp.y][tmp.x-1]!=1) {
					qnow.offer(new Now(tmp.y,tmp.x-1));
					chkArr3[tmp.y][tmp.x-1] = 1;
					count++;
				}
			}
			if (tmp.x < arr3[0].length-1) {
				if (arr3[tmp.y][tmp.x+1].equals(arr3[tmp.y][tmp.x]) && chkArr3[tmp.y][tmp.x+1]!=1) {
					qnow.offer(new Now(tmp.y,tmp.x+1));
					chkArr3[tmp.y][tmp.x+1] = 1;
					count++;
				}
			}
		}
		return count;
	}

}






