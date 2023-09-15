import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(Arrays.asList(s2));
        
        for(String s : s1)
            answer += set.contains(s) ? 1 : 0;
                
        return answer;
    }
}