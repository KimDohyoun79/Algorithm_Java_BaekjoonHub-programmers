import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        ArrayList<Integer> list = new ArrayList<>();
    
        int count = 0;
        for(char c : myString.toCharArray()){
            if(c == 'x'){
                list.add(count);
                count = 0;
            }
            else
                count++;
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}