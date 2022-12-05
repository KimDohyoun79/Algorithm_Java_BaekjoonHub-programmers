class Solution {
    public String solution(int age) {
        String answer = "";
        
        while(age !=0){
            char c = (char)('a' + age%10);
            age /= 10; 
            answer =  c + answer;
        }
        return answer;
    }
}