class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 4; i <= n; i++){
            int count = 1; // 1은 항상 포함
            for(int k = 2; k <= i; k++){
                if(i % k == 0)
                    count++;
            }
            if(count >= 3)
                answer++;
        }
        return answer;
    }
}