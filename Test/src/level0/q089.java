package level0;

public class q089 {

	public static void main(String[] args) {
		// 문자열 바꿔서 찾기
		
		String myString = "ABBAA";
		String pat = "AABB";
		
		int answer = 0;

		String[] a = myString.split("");
		String b = "";
		for (int i=0;i<myString.length();i++) {
			a[i] = a[i].equals("A") ? "B" : "A";
			b += a[i];
		}
		answer = b.contains(pat) ? 1 : 0; 
		
		// 모범답안
		myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        answer = myString.contains(pat) ? 1 : 0;
		
	}

}
