class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while(i++ < n){
            answer++;
            while(answer % 3 == 0 || isThereThree(answer))
                answer++;
        }
        return answer;
    }
    
    public boolean isThereThree(int num){
        
        while(num > 0){
            if(num % 10 == 3)
                return true;
            num /= 10;
        }
        return false;
    }
    
}