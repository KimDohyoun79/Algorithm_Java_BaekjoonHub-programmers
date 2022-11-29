class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        String sk = String.valueOf(k);
        
        return s.indexOf(sk)<0? -1:s.indexOf(sk)+1;
    }
}