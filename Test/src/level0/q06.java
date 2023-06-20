package level0;

public class q06 {

	public static void main(String[] args) {
		// 문자 리스트를 문자열로 변환하기

		String[] arr = new String[3];
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		
		String answer = "";
		
		for (int i=0;i<arr.length;i++) {
			answer = answer + arr[i];
		}
		
	}

}
