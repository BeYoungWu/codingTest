package level0;

public class q75 {

	public static void main(String[] args) {
		// 글자 이어 붙여 문자열 만들기
		
		String my_string = "sdfameifjoasdfn";
		int[] index_list = {4, 9, 14, 3};
		
		String answer = "";
		
		String[] a = my_string.split("");
		for (int i=0;i<index_list.length;i++) {
			answer += a[index_list[i]];
		}

	}

}
