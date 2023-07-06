package level0;

public class q080 {

	public static void main(String[] args) {
		// n보다 커질 때까지 더하기
		
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		
		int answer = 0;
		
		int sum = 0;
		int idx = 0;
		while (true) {
			sum += numbers[idx];
			if (sum>n) {
				answer = sum;
				break;
			} else {
				idx++;
			}
		}
		
		// 모범답안
		for(int i=0; i<numbers.length; i++){
            answer+=numbers[i];
            if(answer>n) {
            	break;
            }
        }

	}

}
