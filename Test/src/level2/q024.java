package level2;

import java.util.HashMap;
import java.util.Map;

public class q024 {

	public static void main(String[] args) {
		// 의상
		
		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglassess","eyewear"},{"green_turban","headgear"}};
		int answer = 1;
		
		Map<String, Integer> cody = new HashMap<>();
		
		for (int i=0;i<clothes.length;i++) {
			cody.put(clothes[i][1], cody.getOrDefault(clothes[i][1], 0) + 1);
		}
		for (String x : cody.keySet()) {
			answer *= cody.get(x) + 1;
		}
		answer = answer - 1;
	}

}
