package level0;

public class q071 {

	public static void main(String[] args) {
		// 접두사인지 확인하기
		
		String my_string = "mona";
		String is_prefix = "on";
		
		int answer = 0;
		
		String[] a = new String[my_string.length()];
		for (int i=0;i<my_string.length();i++) {
			a[i] = my_string.substring(0,i);
		}
		
		for (int i=0;i<a.length;i++) {
			if (a[i].equals(is_prefix)) {
				answer = 1;
			}
		}
		
		// 모범답안
		if (my_string.startsWith(is_prefix)) {
			answer = 1;
		}

	}

}
