class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] s = binomial.split(" ");
        
        switch(s[1]){
            case "+" : answer = Integer.parseInt(s[0]) + Integer.parseInt(s[2]); 
                break;
            case "-" : answer = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
                break;
            case "*" : answer = Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
                break;
        }
        
        return answer;
    }
}