package level2;

public class q025 {

	public static void main(String[] args) {
		// 할인 행사
		
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		
		int answer = 0;
		
		for (int i=0;i<number.length;i++) {
			int cnt = 0;
			for(int j=0;j<want.length;j++) {
				for (int k=0;k<discount.length;k++) {
					if (want[j].equals(discount[k])) {
						cnt++;
					}
				}
			}
			if (cnt>=number[i]) {
				answer++;
			}
		}

	}

}
