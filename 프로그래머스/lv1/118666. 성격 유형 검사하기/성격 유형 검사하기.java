import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        //"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"
        // "RT", CF", JM", "AN"
        char[] cArr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : cArr)
            map.put(c, 0);
        System.out.println(map);

        
        for(int i = 0; i < choices.length; i++){
        
            if(choices[i] < 4)
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            else if(choices[i] > 4)
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
        }
        System.out.println(map);
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 8; i+=2){
            int x = map.get(cArr[i]);
            int y = map.get(cArr[i + 1]);
            sb.append(x >= y ? cArr[i] : cArr[i + 1]);
        }
        
        return sb.toString();
    }
}