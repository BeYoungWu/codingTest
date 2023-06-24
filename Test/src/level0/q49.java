package level0;

public class q49 {

	public static void main(String[] args) {
		// 길이에 따른 연산
		
		int[] num_list = {2, 3, 4, 5};
		
		int answer = 0;
		
		if (num_list.length>=11) {
			for(int i=0;i<num_list.length;i++) {
				answer += num_list[i]; 
			}
		} else {
			answer = 1;
			for(int i=0;i<num_list.length;i++) {
				answer *= num_list[i];
			}
		}
		
		// 모범답안
		int answer2 = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer2 *= num_list[i];
            }else{
                answer2 += num_list[i];
            }
        }
        
	}

}
