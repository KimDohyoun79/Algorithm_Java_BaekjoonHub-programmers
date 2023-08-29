import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
            int nextMax = 1000000;
            for(int k = queries[i][0]; k <= queries[i][1]; k++){
                if(queries[i][2] < arr[k] &&  arr[k] < nextMax){
                        nextMax = arr[k];
                }
            }
            if(nextMax == 1000000)
                list.add(-1);
            else
                list.add(nextMax);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}