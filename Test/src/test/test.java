package test;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		///////////////////////////////////////////////////////////
		int len1 = friends.length;
        int len2 = gifts.length;

        // 개인 선물지수
        Map<String, Integer> giftScore = new HashMap<>();
        // 서로 선물 개수
        Map<String, Map<String, Integer>> giftCnt = new HashMap<>();

        for(String gift : gifts) {
            String[] str = gift.split(" ");
            for(int i=0;i<len1;i++) {
                String giver = str[0];
                String receiver = str[1];
                if(giver.equals(friends[i])) {                    
                    giftScore.put(giver, giftCnt.getOrDefault(giver, 0) + 1);
                    giftCnt.putIfAbsent(giver, new HashMap<>());
                    giftCnt.get(giver).put(receiver, giftCnt.get(giver).getOrDefault(receiver, 0) + 1);
                }
                if(receiver.equals(friends[i])) {
                    giftScore.put(receiver, giftCnt.getOrDefault(receiver, 0) - 1);
                }
            }
        }

        // 다음 달 선물 개수
        Map<String, Integer> answer = new HashMap<>();
        // 개수 같은 경우 
        // 1. 선물지수 다른 경우
        // 2. 선물지수 같은 경우

        // 개수 다른 경우
		
        /////////////////////////////////////////////////////////
        
        
        
	}
	
}













