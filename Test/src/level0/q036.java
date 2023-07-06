package level0;

public class q036 {

	public static void main(String[] args) {
		// 옷가게 할인 받기
		
		int price = 580000;
		
		int answer = 0;
		
		if (price>=100000 && price<300000) {
			answer = price * 95 / 100;
		} else if (price>=300000 && price<500000) {
			answer = price * 90 / 100;
		} else if (price>=500000) {
			answer = price * 80 / 100;
		} else {
			answer = price;
		}

	}

}
