class Solution {
    public int solution(int n) {
        int answer = 0;
        int n1 = 1;
        int n2 = 1;
        int count = 2;
        while(count < n){
            int tmp = n1;
            n1 = n2;
            n2 = (tmp + n2) % 1234567;
            count++;
        }
        return n2;
    }
}