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
				if(bridge.isEmpty()) {// 큐에 아무것도 없는 경우 = 어떠한 트럭도 다리위에 없음
					bridge.add(truck);
					sum += truck;
					time++;
					break;
				} else if (bridge.size()==bridge_length) {// 큐에 다리 길이만큼 트럭이 다 찬 경우
					sum -= bridge.poll();
				} else {// 다리 길이만큼 큐가 차지않았음
					if (sum+truck <= weight) {// weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌
						bridge.add(truck);
						sum += truck;
						time++;
						break;
					} else {// 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만듬
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
