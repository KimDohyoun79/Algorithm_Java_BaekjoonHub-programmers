class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        // 3진법 변환 및 앞뒤 반전
        while(n > 0){
            sb.append(n % 3); 
            n /= 3;
        }
        
        
        // 10진법 변환
        Long ll = Long.parseLong(sb.toString());

        int i = 0;
        while(ll > 0){
            answer += Math.pow(3, i++) * (ll % 10);
            ll /=10; 
        }
        return answer;
    }
}