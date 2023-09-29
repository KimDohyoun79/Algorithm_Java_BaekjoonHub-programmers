class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = binary(n);
        
        while(true){
            if(nCount == binary(++n))
                break;
        }
        return n;
    }
    
    public int binary(int num){
        
        int result = 0;
        while(num > 0){
            if(num % 2 == 1)
                result++;
            num /= 2;
        }
        return result;
    }
}