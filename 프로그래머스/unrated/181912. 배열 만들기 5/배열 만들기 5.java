import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            int n = Integer.parseInt(str.substring(s, s + l));
            if(n > k)
                list.add(n);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        return answer;
    }
}