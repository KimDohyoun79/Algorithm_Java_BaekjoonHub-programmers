class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();
        
        if(len == 4 || len == 6){
            int i;
            for(i = 0; i < len; i++){
                if('0' <= s.charAt(i) && s.charAt(i) <= '9')
                    continue;
                else
                    break;
            }
            answer = i ==len ? true : false;
        }
        
        return answer;
    }
}