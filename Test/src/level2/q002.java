package level2;

public class q002 {

	public static void main(String[] args) {
		// JadenCase 문자열 만들기
		
		String s = "3people unFollowed me";
		
		String answer = "";
		
		String[] a = s.split(" ");
		for (int i=0;i<a.length;i++) {
			if (a[i].length()==0) {
				answer += a[i] + " ";
			} else {
				a[i] = a[i].substring(0,1).toUpperCase() + a[i].substring(1,a[i].length()).toLowerCase();
				answer += a[i] + " ";
			}
		}
		if (!s.substring(s.length()-1, s.length()).equals(" ")) {
			answer = answer.substring(0, answer.length()-1);
		}
		
		// 모범답안
		String[] sp = s.toLowerCase().split(""); // 공백도 같이 스플릿함
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false; // 앞글자가 공백이면 뒷글자가 첫글자로 판단
        }

	}

}
