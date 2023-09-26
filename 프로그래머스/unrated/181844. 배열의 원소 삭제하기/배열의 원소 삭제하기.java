import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : delete_list)
            set.add(num);
        
        for(int num : arr)
            if(!set.contains(num))
                list.add(num);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
            
        return answer;
    }
}