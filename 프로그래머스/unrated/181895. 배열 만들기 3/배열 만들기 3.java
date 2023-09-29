import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int[] a1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] a2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        int[] answer = new int[a1.length + a2.length];
        
        int i;
        for (i = 0; i < a1.length; i++)
            answer[i] = a1[i];
        
        for (int j = 0; j < a2.length; j++) 
            answer[i + j] = a2[j];
        
        return answer;
    }
}