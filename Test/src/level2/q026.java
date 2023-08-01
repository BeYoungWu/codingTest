package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class q026 {

	public static void main(String[] args) {
		// 튜플
		
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

		ArrayList<Integer> answer = new ArrayList<>();
		
		s = s.substring(2, s.length());
		s = s.substring(0, s.length()-2).replace("},{", "-");
		String[] split = s.split("-");
		Arrays.sort(split,new Comparator<String>(){
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(), o2.length());
            }
        });
		
		for(String x : split){
            String[] temp = x.split(",");
            for(int i = 0 ; i < temp.length;i++){
                int n = Integer.parseInt(temp[i]);
                if(!answer.contains(n))
                    answer.add(n);
            }
        }
		
		// 다른 답안
		Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer2 = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer2[idx++] = Integer.parseInt(s2);
            }
        }
		
	}

}
