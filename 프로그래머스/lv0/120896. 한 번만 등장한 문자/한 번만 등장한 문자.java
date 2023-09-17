class Solution {
    public String solution(String s) {
        
        StringBuilder str = new StringBuilder();
        int[] alphaCount = new int[26];
        
        for(char c : s.toCharArray())
            alphaCount[c - 'a']++;
        
        for(int i = 0;  i < 26; i++){
            if(alphaCount[i] == 1)
                str.append((char)(i + 'a'));
        } 
        
        return str.toString();
    }
}