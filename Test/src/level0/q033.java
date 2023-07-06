package level0;

public class q033 {

	public static void main(String[] args) {
		// 머쓱이보다 키 큰 사람
		
		int[] array = {180, 120, 140};
		int height = 190;
		
		int answer = 0;
		
		for (int i=0;i<array.length;i++) {
			if(height<array[i]) {
				answer += 1;
			}
		}

	}

}
