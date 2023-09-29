class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        Long pInt = Long.parseLong(p);
        
        for(int i = 0; i < t.length() - pLen + 1; i++){
            String s = t.substring(i, i + pLen);
            if(Long.parseLong(s) <= pInt)
                answer++;
        }
        return answer;
    }
}