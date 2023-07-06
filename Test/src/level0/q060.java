package level0;

public class q060 {

	public static void main(String[] args) {
		// 이어 붙인 수
		
		int[] num_list = {3, 4, 5, 2, 1};
		
		int answer = 0;
		
		String a = "";
		String b = "";
		
		for (int i=0;i<num_list.length;i++) {
			if(num_list[i]%2==0) {
				a += Integer.toString(num_list[i]);
			} else {
				b += Integer.toString(num_list[i]);
			}
		}
		
		answer = Integer.parseInt(a) + Integer.parseInt(b);
		
		// 모범답안
		int even = 0;
		int odd = 0;
		
		for(int num : num_list) {
			if(num%2==0) {
				even *= 10;
				even += num;
			} else {
				odd *= 10;
				odd *= num;
			}
		}
		answer = even + odd;

	}

}
