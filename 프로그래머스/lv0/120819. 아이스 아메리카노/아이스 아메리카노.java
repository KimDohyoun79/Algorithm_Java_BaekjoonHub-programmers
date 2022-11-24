class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        int a = money / 5500;
        int m = money - (5500*a);
        
        answer = new int[]{a, m};
        return answer;
    }
}