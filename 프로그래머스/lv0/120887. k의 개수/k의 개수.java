class Solution {
    public int solution(int i, int j, int k) {
        
        int answer = 0;
        
        for(; i <= j; i++){
            
            int num = i;
            
            while(num > 0){
                if(num % 10 == k)
                    answer++;
                num /= 10;
            }
        }
        
        return answer;
    }
}