import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        int[] arr = new int[26];
       
        // before 문자 카운트하여 저장
        for(int i = 0; i < before.length(); i++)
            arr[before.charAt(i) - 'a'] += 1;
        
        // after 문자 디카운트하여 연산
        for(int i = 0; i < after.length(); i++)
            arr[after.charAt(i) - 'a'] -= 1;
        
        // 배열 arr이 모두 0이면 1을, 아니면 0을 반환
        for(int num : arr)
            if(num != 0)
                return 0;
        
        return 1;
    }
}