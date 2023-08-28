class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        
        int mode = 0;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1'){
                mode = (mode == 0 ? 1 : 0);
                continue;
            }
            
            if (i % 2 == mode){
                answer.append(code.charAt(i));
            }
            else if(i % 2 == mode){
                answer.append(code.charAt(i));
            }
            
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}