package level2;

import java.util.Stack;

public class q009 {

	public static void main(String[] args) {
		// 짝지어 제거하기
		
		String s = "mona";
		
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if (!stack.isEmpty() && stack.peek() == ch) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		answer = stack.isEmpty() ? 1 : 0;
	}

}
