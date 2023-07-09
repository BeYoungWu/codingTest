package level0;

public class q093 {

	public static void main(String[] args) {
		// 5명씩
		
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		int a = (names.length % 5 == 0) ? names.length/5 : names.length/5 + 1;
		String[] answer = new String[a];
		
		answer[0] = names[0];
		int index = 1;
		for (int i=1;i<names.length;i++) {
			if (i%5==0) {
				answer[index] = names[i];
				index++;
			}
		}
		
		
	}
}