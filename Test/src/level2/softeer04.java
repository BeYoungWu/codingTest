package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class softeer04 {

	public static void main(String[] args) throws IOException {
		// 회의실 예약
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, int[][]> map = new TreeMap<>();
		for (int i=0;i<N;i++) {
			int[][] tmp = new int[9][2];
			for (int j=0;j<9;j++) {
				tmp[j][0] = j;
				tmp[j][1] = j+1;
			}
			map.put(br.readLine(), tmp);
		}
		
		for (int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			String key = st.nextToken();
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			int[][] curr = map.get(key);
			for (int j=start;j<end;j++) {
				curr[j-9][0] = -1;
				curr[j-9][1] = -1;
			}
			
		}
		
		for (Map.Entry<String, int[][]> entry : map.entrySet()) {
            sb.append("Room ").append(entry.getKey()).append(":").append("\n");
            StringBuilder temp = new StringBuilder();
            int[][] curr = entry.getValue();
            int total = 0;
            int start = -1;
            int end = -1;
            for (int i = 0; i < 9; i++) {
                if (curr[i][0] != -1) {
                    // 예약 가능한 시간대인 경우
                    if (start == -1) {
                        // 아직 시작점이 정해지지 않은 경우
                        start = curr[i][0];
                    }
                } else {
                    // 예약 불가 시간인 경우
                    if (start != -1) {
                        // 시작점이 정해진 경우 -> end가 와야된다.
                        end = curr[i - 1][1];
                    }
                }

                if (start != -1 && end != -1) {
                    temp.append(start == 0 ? "09" : start + 9).append("-");
                    temp.append(end + 9).append("\n");
                    start = end = -1;
                    total++;
                }
            }

            if (start != -1) {
                // 아직 처리되지 않은게 남음
                total++;
                temp.append(start + 9 == 9 ? "09" : start + 9).append("-").append(18).append("\n");
            }

            if (total == 0) {
                sb.append("Not available").append("\n");
            } else {
                sb.append(total).append(" available:").append("\n");
                sb.append(temp);
            }

            sb.append("-----").append("\n");
        }

		// 맨 마지막 하이픈 제거
        sb.setLength(sb.length() - 6);

        System.out.println(sb);
		

	}

}
