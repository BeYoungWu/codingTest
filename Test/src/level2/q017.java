package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q017 {

	public static void main(String[] args) {
		// 귤 고르기
		
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		int answer = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int t : tangerine) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}

//		System.out.println(map);
		
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for (Integer x : map.keySet()) {
//			System.out.println(map.get(x));
			list.add(map.get(x));
		}
		list.sort(Collections.reverseOrder());

		for (Integer x : list) {
			answer++;
			sum += x;
			if (sum >= k) {
				break;
			}
		}
		
	}

}
