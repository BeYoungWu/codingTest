package level0;

public class q91 {

	public static void main(String[] args) {
		// 배열의 길이에 따라 다른 연산하기
		
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		
		int[] answer = new int[arr.length];
		
		for (int i=0;i<arr.length;i++) {
			if (arr.length%2==0) {
				if (i%2==0) {
					answer[i] = arr[i];
				} else {
					answer[i] = arr[i] + n;
				}
			} else {
				if (i%2==0) {
					answer[i] = arr[i] + n;
				} else {
					answer[i] = arr[i];
				}
			}
		}

	}

}
