class Solution {
    public String solution(String s) {
        
        String answer = "";
        int[] alphaCount = new int[26];
        
        for(char c : s.toCharArray())
            alphaCount[c - 'a']++;
        
        for(int i = 0;  i < 26; i++){
            if(alphaCount[i] == 1)
                answer += (char)(i + 'a');
        } 
        
        return answer;
    }
}