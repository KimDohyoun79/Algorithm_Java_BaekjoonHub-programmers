class Solution {
    public int solution(int n) {
        int answer = 0;
        long num = (long)n;
        
        while(num != 1 && answer < 500){
            if(num % 2 == 0)
                num /= 2;
            else
                num = (num * 3) + 1;
            answer++;
        }
        
        return answer < 500 ? answer : -1;
    }
}