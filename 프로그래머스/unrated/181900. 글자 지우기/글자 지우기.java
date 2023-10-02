import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        char[] cArr = my_string.toCharArray();
        
        for(int i : indices)
            cArr[i] = '1';
        
        StringBuilder sb = new StringBuilder();
        for(char c : cArr)
            if(c != '1')
                sb.append(c);

        return sb.toString();
    }
}