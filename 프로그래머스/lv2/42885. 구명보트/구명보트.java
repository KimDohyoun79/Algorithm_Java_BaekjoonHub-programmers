import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        int answer = 0;
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            int remain = limit - people[right--];
            if(people[left] <= remain)
                left++;
            answer++;
        }
        return answer;
    }
}