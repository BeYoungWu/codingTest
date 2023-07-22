package level2;

import java.util.ArrayList;

public class q023 {

	public static void main(String[] args) {
		// [1차] 캐시
		
		int cacheSize = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		int answer = 0;
		
		ArrayList<String> cache = new ArrayList<>();
		
		if (cacheSize==0) {
			answer = cities.length * 5;
//			return answer;
		}
		
		for (int i=0;i<cities.length;i++) {
			cities[i] = cities[i].toUpperCase();
			if (cache.contains(cities[i])) {
				cache.remove(cities[i]);
				cache.add(cities[i]);
				answer += 1;
			} else {
				if (cache.size()==cacheSize) {
					cache.remove(0);
					cache.add(cities[i]);
				} else {
					cache.add(cities[i]);
				}
				answer += 5;
			}
		}

	}

}
