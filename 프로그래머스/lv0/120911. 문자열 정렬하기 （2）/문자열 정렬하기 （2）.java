import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
//         #2
        char[] c = my_string.toLowerCase().toCharArray();
                
        Arrays.sort(c);
        
        return new String(c);
        
           // #1
//         String[] str = my_string.toLowerCase().split("");
        
//         Arrays.sort(str);
        
//         return String.join("", str);
    }
}