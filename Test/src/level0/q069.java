package level0;

public class q069 {

	public static void main(String[] args) {
		// 첫 번째로 나오는 음수
		
		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		
		int answer = 0;
		
		int i = 0;
		while(i<num_list.length) {
			if (num_list[i]<0) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
			i++;
		}

	}

}
