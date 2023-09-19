package test;

public class test0701 {

	static boolean[] answer;
	
	public static void main(String[] args) {
		String[] a = {"abab", "bbaa", "bababa", "bbbabababbbaa"};
		
		answer = new boolean[a.length];
		
		for (int i=0;i<a.length;i++) {
			String now = "a";
			dfs(now, a[i], i);
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer);
		}
	}
	
	public static void dfs(String now, String target, int index) {
		if (now.length() > target.length()) {
			return;
		}
		
		if (now.equals(target)) {
			answer[index] = true;
			return;
		} else {
			dfs("a" + now, target, index);
			dfs(now + "a", target, index);
			int cnt = 0;
			for (int i=0;i<now.length();i++) {
				if (now.charAt(i)=='a') {
					cnt++;
				}
			}
			String b = "b".repeat(cnt);
			dfs(b + now + b, target, index);
		}
		
		
	}

}
