package level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class q001 {

	public static void main(String[] args) {
		// 이중우선순위큐
		
		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		
		int[] answer = new int[2];
		
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (String operation : operations) {
            String[] split = operation.split(" ");

            if (split[0].equals("I")) {
            	max.add(Integer.parseInt(split[1]));
            	min.add(Integer.parseInt(split[1]));
            } else if (split[0].equals("D")) {
                if (!max.isEmpty()) {
                    if (split[1].equals("1")) {
                        int maxNum = max.peek();
                        max.remove(maxNum);
                        min.remove(maxNum);

                    } else {
                        int minNum = min.peek();
                        max.remove(minNum);
                        min.remove(minNum);
                    }
                }
            }
        }
        if (!max.isEmpty()) {
            answer[0] = max.peek();
            answer[1] = min.peek();
        }

	}

}
