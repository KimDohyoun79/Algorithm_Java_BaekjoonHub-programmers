class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        for(String s :  myStr.split("[abc]")){
            if(!s.equals("")){
                sb.append(s);
                sb.append(" ");
            }
        }
        
        String[] answer = sb.toString().split(" ");
        if(answer[0].length() == 0) 
            answer[0] = "EMPTY";
        return answer;
    }
}