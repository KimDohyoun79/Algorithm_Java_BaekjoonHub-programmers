import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] s = String.valueOf(n).split("");

        Arrays.sort(s);
        for(int i = s.length - 1; i >= 0; i--)
            answer = answer * 10 + Long.parseLong(s[i]);
        
        return answer;
    }
}