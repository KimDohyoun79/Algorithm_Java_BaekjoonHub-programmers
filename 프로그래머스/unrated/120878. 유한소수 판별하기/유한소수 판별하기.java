class Solution {
    public int solution(int a, int b) {

        // 기약 분수 만들기
        int i = 2;
        while(i <= b){
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
                i = 2;
            }
            else
                i++;
        }
        
        // 유한 소수 확인
        while(b > 1){
            if(b % 2 == 0)
                b /= 2;
            else if(b % 5 == 0)
                b /= 5;
            else
                return 2;
        }
        
        return 1;
    }
}