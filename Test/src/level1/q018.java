package level1;

public class q018 {

	public static void main(String[] args) {
		// 핸드폰 번호 가리기
		
		String phone_number = "01033334444";
		
		String answer = "";
		
		String[] a = phone_number.split("");
		for (int i=0;i<phone_number.length()-4;i++) {
			a[i] = "*";
		}
		for (int i=0;i<a.length;i++) {
			answer += a[i];
		}

	}

}
