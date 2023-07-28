package level1;

public class q026 {

	public static void main(String[] args) {
		// 부족한 금액 계산하기
		
		int price = 3;
		int money = 20;
		int count = 4;
		
		long answer = -1;
		
		long total = 0;
		for (int i=1;i<=count;i++) {
			total += price * i;
		}
		answer = (total >= money) ? total - money : 0;

	}

}
