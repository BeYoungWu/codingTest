package level2;

import java.util.Arrays;

public class q013 {

	public static void main(String[] args) {
		// 구명보트
		
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		
		int answer = 0;

		Arrays.sort(people);
		int index = 0;
		for (int i=people.length-1;i >= index;i--) {
			if (people[i] + people[index] <= limit) {
				index++;
				answer++;
			} else {
				answer ++;
			}
		}

		// 다른 답안
		Arrays.sort(people);
		int i = 0, j = people.length - 1;
		for (;i<j;--j) {
			if (people[i] + people[j] <= limit) {
				++i;
			}
		}
		answer = people.length - i;
		
	}

}
