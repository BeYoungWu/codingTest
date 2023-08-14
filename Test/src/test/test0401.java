package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Move {
	int x;
	int y;
	int red;
	
	Move(int y, int x, int red) {
		this.y = y;
		this.x = x;
		this.red = red;
	}
}

public class test0401 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] cars = new int[7][7];
		
		for (int i=0;i<7;i++) {
			String str = br.readLine();
			for (int j=0;j<7;j++) {
				cars[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}

	}

}
