import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                int n = arr[i] * 2;
                while(n-- > 0)
                    list.add(arr[i]);
            }
            else{
                int len = list.size();
                while(arr[i]-- > 0)
                    list.remove(--len);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}