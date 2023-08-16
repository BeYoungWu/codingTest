package test;

public class test0501 {

	public static void main(String[] args) {
		String data = "00011011";
		String penter = "10";
		String pexit = "11";
		String pescape = "00";
		
		String answer = penter;
		
		int n = penter.length();
		for (int i=0;i<data.length()/n;i++) {
			int start = i * n ;
			int end = start + n;
			String str = data.substring(start, end);
			if (str.equals(penter) || str.equals(pexit) || str.equals(pescape)) {
				answer += pescape;
			}
			answer += str;
		}
		answer += pexit;
		
		System.out.println(answer);
	}

}
