package level2;

import java.util.ArrayList;
import java.util.HashSet;

public class q010 {

	public static void main(String[] args) {
		// 영어 끝말잇기
		
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mont", "tank"};
		
		int[] answer = new int[2];
		
		ArrayList<String> list = new ArrayList<>();
		for (int i=0;i<words.length;i++) {
			if (list.contains(words[i])) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
			list.add(words[i]);
			if (i>0 && words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
		}
		
		// 모범답안
		HashSet<String> set = new HashSet<String>();
		String prev = "";
		set.add(words[0]);
		for (int i=1;i<words.length;i++) {
			prev = words[i-1];
			if (set.contains(words[i]) || prev.charAt(prev.length()-1)!=words[i].charAt(0)) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
			set.add(words[i]);
		}

	}

}
