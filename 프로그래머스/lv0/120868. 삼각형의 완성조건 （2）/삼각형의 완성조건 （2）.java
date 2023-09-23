class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // 가장 긴 변이 max 인 경우
        answer += max - (max - min);
        
        // 나머지 한 변이 가장 긴 변인 경우
        answer += (max + min) - max - 1;
        
        return answer;
    }
}