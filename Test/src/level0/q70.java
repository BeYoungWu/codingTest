package level0;

public class q70 {

	public static void main(String[] args) {
		// 배열의 원소만큼 추가하기
		
		int[] arr = {5, 1, 4};
		
		int len = 0;
		for (int i=0;i<arr.length;i++) {
			len += arr[i];
		}
		
		int[] answer = new int[len];
		
		int idx = 0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i];j++) {
				answer[idx++] = arr[i];
			}
		}

	}

}
