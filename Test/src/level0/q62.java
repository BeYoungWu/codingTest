package level0;

public class q62 {

	public static void main(String[] args) {
		// 수 조작하기 1
		
		int n = 0;
		String control = "wdsaads";
		
		String[] a = control.split("");
		for (int i=0;i<control.length();i++) {
			if(a[i].equals("w")) {
				n += 1;
			} else if(a[i].equals("s")) {
				n -= 1;
			} else if(a[i].equals("d")) {
				n += 10;
			} else if(a[i].equals("a")) {
				n -= 10;
			}
		}

	}

}
