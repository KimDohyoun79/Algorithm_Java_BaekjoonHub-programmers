import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                if(list.size() == k)
                    break;
            }
                
        }
        
        int[] answer = new int[k];
        int listSize = list.size();
        for(int i = 0; i < k; i++){
            if(listSize > 0){
                answer[i] = list.get(i);
                listSize--;
            }
            else
                answer[i] = -1;
        }
        
        return answer;
    }
}