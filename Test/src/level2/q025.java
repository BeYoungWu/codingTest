package level2;

import java.util.HashMap;
import java.util.Map;

public class q025 {

	public static void main(String[] args) {
		// 할인 행사
		
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		
		int answer = 0;
		
		Map<String, Integer> wantMap = new HashMap<>();
		for (int i=0;i<want.length;i++) {
			wantMap.put(want[i], number[i]);
		}
		
		for (int i=0;i<discount.length-9;i++) {
			Map<String, Integer> map = new HashMap<>();
			int cnt = 0;
			for (int j=i;j<i+10;j++) {
				map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
			}
			int idx = 0;
			boolean chk = true;
			for (String x : map.keySet()) {
				if (wantMap.get(x)!=map.get(x)) {
					chk = false;
					break;
				}
				idx++;
			}
			answer += chk ? 1 : 0;
		}
		
	}

}
