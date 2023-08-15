package test;

public class test0103 {

	public static void main(String[] args) {

		String[] replies = {"AFFDEFDEFDEEC", "ABABABABBCCEF", "FFFFFFFFFFFFF"};
		int n = 3;
		int k = 2;
		
		int[] answer = new int[replies.length];
		
		for (int i = 0; i < replies.length; i++) {
            String reply = replies[i];

            for (int j = 0; j <= reply.length() - n; j++) {
                String pattern = reply.substring(j, j + n);
                int count = 1;

                // 현재 패턴과 이후 패턴들을 비교하여 카운트
                for (int x = j + n; x <= reply.length() - n; x += n) {
                    String nextPattern = reply.substring(x, x + n);
                    if (pattern.equals(nextPattern)) {
                        count++;
                        if (count >= k) {
                            answer[i] = 0; // 불량
                            break;
                        }
                    } else {
                        break; // 다른 패턴이 나온 경우, 다음 패턴으로 이동
                    }
                }

                if (answer[i] == 0) {
                    break; // 불량인 경우, 다음 설문지로 이동
                }
            }

            // 불량이 아닌 경우 정상
            if (answer[i] != 0) {
                answer[i] = 1;
            }
        }
	}

}
