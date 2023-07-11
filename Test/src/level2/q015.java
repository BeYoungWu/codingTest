package level2;

public class q015 {

	public static void main(String[] args) {
		// N개의 최소공배수
		
		int[] arr = {2, 6, 8, 14};
		
		int answer = 0;

		int n = arr[0];
		for (int i=0;i<arr.length-1;i++) {
			n = lcm(n, arr[i+1]);
		}
		answer = n;

	}
	
	static int gcd (int a, int b) {
		while (b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	
	static int lcm (int a, int b) {
		if (a>=b) {
			return a*b/gcd(a,b);
		} else {
			return b*a/gcd(b,a);
		}
	}

}
