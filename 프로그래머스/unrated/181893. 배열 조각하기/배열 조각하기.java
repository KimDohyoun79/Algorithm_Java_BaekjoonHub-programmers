import java.util.ArrayList;

class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    
    public int[] solution(int[] arr, int[] query) {
        
        
        for(int n : arr)
            list.add(n);
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                 removeArr(query[i] + 1, list.size());
            }
            else{
                removeArr(0, query[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private void removeArr(int s, int e){
        
        for(int i = s; i < e; i++)
            list.remove(s);
    }
    
}