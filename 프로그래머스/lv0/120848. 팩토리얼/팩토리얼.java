class Solution {
    public int solution(int n) {
        
        int pac = 1;
        int result = 1;
        while(result <= n){
            result *= pac++;
        }
        
        return pac - 2;
    }
}