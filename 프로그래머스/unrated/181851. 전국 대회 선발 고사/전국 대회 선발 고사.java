import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < rank.length; i++)
            if(attendance[i])
                map.put(rank[i], i);
        
        ArrayList<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        int answer = (map.get(keySet.get(0)) * 10000) + (map.get(keySet.get(1)) * 100) + (map.get(keySet.get(2)));
       
        return answer;
    }
}