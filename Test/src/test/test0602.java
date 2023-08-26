package test;

import java.util.HashSet;
import java.util.Set;

public class test0602 {

	static Set<Integer> set = new HashSet<>();
	
	public static void main(String[] args) {
		
		int[][] dice = {};
		
		int answer = -1;
		
		int n = dice.length;
		
		for (int i=1;i<=n;i++) {
			dfs(dice, -1, 0, 0, i);
		}
		
		while (set.contains(answer)) {
			answer++;
		}
		
		System.out.println(answer);
		
	}
	
	public static void dfs(int[][] dice, int prev, int num, int depth, int n) {
		// 테스트 케이스 19개중 17개 성공, 2개 실패
		// => 아마 여러개 주사위일때 한주사위 숫자를 두 번 사용하는 경우? (prev의 prev는 모르기 때문)
		// => boolean[] visited 써보려 했지만 런타임 에러
		
		if (depth==n) {
			set.add(num);
			return;
		}
		
		for (int i=0;i<dice.length;i++) {
			for (int j=0;j<dice[0].length;j++) {
				if (depth==0 && dice[i][j]!=0) {
					dfs(dice, i, num*10 + dice[i][j], depth + 1, n);
				} else if (depth!=0 && i!=prev) {
					dfs(dice, i, num*10 + dice[i][j], depth + 1, n);
				}
			}
		}
	}
}