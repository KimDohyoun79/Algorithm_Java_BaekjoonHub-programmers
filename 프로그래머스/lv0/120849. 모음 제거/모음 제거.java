class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strs = my_string.split("");
        
        for(String s : strs){
            
            switch(s){
                case("a") : break;
                case("e") : break;
                case("i") : break;
                case("o") : break;
                case("u") : break;
                default : answer += s;
            }
            
        }
        
        return answer;
    }
}