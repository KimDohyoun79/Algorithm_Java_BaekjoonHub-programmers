class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if(i == s){
                for(int k = 0; k < overwrite_string.length(); k++){
                    answer += overwrite_string.charAt(k);
                    i++;
                }
            }
            if(i < my_string.length())
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}