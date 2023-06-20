package level0;

public class q19 {

	public static void main(String[] args) {
		// 배열의 평균값
		
		int[] numbers = new int[10];
		
		double answer = 0;
		
		double sum = 0;
		for (int i=0;i<numbers.length;i++) {
			sum += numbers[i];
		}
		answer = sum / numbers.length;
		
	}

}
