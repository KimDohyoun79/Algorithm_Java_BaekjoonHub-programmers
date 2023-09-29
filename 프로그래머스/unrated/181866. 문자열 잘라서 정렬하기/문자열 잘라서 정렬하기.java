import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        ArrayList<String> list = new ArrayList<>();
        String[] sArr = myString.split("[x+]");
        Arrays.sort(sArr);
        
        for(String s : sArr){
            if(!s.equals(""))
                list.add(s);
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}