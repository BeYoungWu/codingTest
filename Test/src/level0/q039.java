package level0;

public class q039 {

	public static void main(String[] args) {
		// 배열의 유사도
		
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "mona", "c"};
		
		int answer = 0;
		
		for (int i=0;i<s1.length;i++) {
			for (int j=0;j<s2.length;j++) {
				if(s2[j].equals(s1[i])) {
					answer += 1;
				}
			}
		}

	}

}
