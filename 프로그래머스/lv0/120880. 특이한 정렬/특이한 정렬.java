import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Arrays.sort(numlist);
        HashMap<Double, Integer> map = new HashMap();       
        for(int i = 0 ; i < numlist.length;i++){
            int num = numlist[i] - n;
            map.put(num > 0 ? num - 0.5 : Math.abs(num), numlist[i]); 
        }
        
        List<Double> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        
        int[] answer = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++){
            answer[i] = map.get(keyList.get(i));
        } 

        return answer;
    }
}