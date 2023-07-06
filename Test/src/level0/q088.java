package level0;

public class q088 {

	public static void main(String[] args) {
		// 배열 비교하기
		
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		
		int answer = 0;
		
		int a1 = 0;
		int a2 = 0;
		for (int i=0;i<arr1.length;i++) {
			a1 += arr1[i];
		}
		for (int i=0;i<arr2.length;i++) {
			a2 += arr2[i];
		}
		
		if (arr1.length == arr2.length) {
			if (a1 == a2) {
				answer = 0;
			} else if (a1 > a2) {
				answer = 1;
			} else {
				answer = -1;
			}
		} else if (arr1.length > arr2.length) {
			answer = 1;
		} else {
			answer = -1;
		}

		// 모범답안
		if (arr1.length < arr2.length) {
			answer = -1;
		} else if (arr1.length > arr2.length) {
			answer = 1;
		}
		int arr1Sum = 0;
		int arr2Sum = 0;
		for (int i=0;i<arr1.length;i++) {
			arr1Sum += arr1[i];
			arr2Sum += arr2[i];
		}
		answer = (arr1Sum == arr2Sum) ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
		
	}

}
