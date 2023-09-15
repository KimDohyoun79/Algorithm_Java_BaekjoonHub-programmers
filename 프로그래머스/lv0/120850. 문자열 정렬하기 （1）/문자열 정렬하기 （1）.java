import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String[] str = my_string.replaceAll("[a-z]", "").split("");
        
        int[] numArr = Arrays.stream(str)
                             .mapToInt(Integer::parseInt)
                             .toArray();
        Arrays.sort(numArr);
        
        return numArr;
    }
}