package level0;

public class q84 {

	public static void main(String[] args) {
		// 꼬리 문자열

		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		
		String answer = "";
		
		for (int i=0;i<str_list.length;i++) {
			if (!str_list[i].contains(ex)) {
				answer += str_list[i];
			} 
		}
		
	}

}
