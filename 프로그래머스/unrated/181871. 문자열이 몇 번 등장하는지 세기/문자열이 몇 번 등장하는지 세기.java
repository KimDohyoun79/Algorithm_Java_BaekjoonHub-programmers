class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLen = pat.length();
        for(int i = 0; i <= myString.length() - patLen; i++){
            if(myString.charAt(i) == pat.charAt(0)){
                String str = myString.substring(i, i + patLen);
                if(str.equals(pat))
                    answer++;
            }
        }
        return answer;
    }
}