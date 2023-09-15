import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.toLowerCase().split("");
        
        Arrays.sort(str);
        
        return String.join("", str);
    }
}