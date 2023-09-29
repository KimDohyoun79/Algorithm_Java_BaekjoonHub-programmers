class Solution {
    public int[] solution(long n) {
        
        int len = nLen(n);
        int[] answer = new int[nLen(n)];
        
        for(int i = 0; i < len; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
    
    public int nLen(long num){
        int len = 0;
        while(num > 0){
            num /= 10;
            len++;
        }
        return len;
    }
    
}