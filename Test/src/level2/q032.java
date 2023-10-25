package level2;

import java.util.LinkedList;
import java.util.Queue;

public class q032 {

	public static void main(String[] args) {
		// 다리를 지나는 트럭
		
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		
		int answer = 0;
		
		Queue<Integer> bridge = new LinkedList<>();
		int sum = 0;
		int time = 0;
		
		for (int i=0;i<truck_weights.length;i++) {
			int truck = truck_weights[i];
			
			while (true) {
				if(bridge.isEmpty()) {// 다리 위에 트럭이 없는 경우
					bridge.add(truck);
					sum += truck;
					time++;
					break;
				} else if (bridge.size()==bridge_length) {// 다리 위에 트럭이 가득 찬 경우
					sum -= bridge.poll();
				} else {// 다리 위에 트럭이 가득 차지 않고 있는 경우
					if (sum+truck <= weight) {// weight 값을 넘지 않으면서 새로운 트럭을 다리에 올리기
						bridge.add(truck);
						sum += truck;
						time++;
						break;
					} else {// weight 값을 넘는다면 0을 넣어 이미 다리 위에 있는 트럭이 전진
						bridge.add(0);
						time++;
					}
				}
			}
		}
		
		answer = time + bridge_length;
		
		System.out.println(answer);
	}

}
