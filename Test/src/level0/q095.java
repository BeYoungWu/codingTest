package level0;

public class q095 {

	public static void main(String[] args) {
		// 가위 바위 보
		
		String rsp = "205";
		
		String answer = "";
		
		String[] a = rsp.split("");
		for (int i=0;i<a.length;i++) {
			switch(a[i]) {
			case "0":
				answer += "5";
				break;
			case "2":
				answer += "0";
				break;
			case "5":
				answer += "2";
				break;
			}
		}

	}

}
