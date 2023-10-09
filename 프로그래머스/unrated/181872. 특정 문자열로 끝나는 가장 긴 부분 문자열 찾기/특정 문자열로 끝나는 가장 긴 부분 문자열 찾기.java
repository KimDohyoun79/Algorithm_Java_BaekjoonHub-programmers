class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int patLen = pat.length();
        for(int i = myString.length() - 1; i >= 0; i--){
            if(myString.charAt(i) == pat.charAt(patLen - 1)){
                int ii = i;
                int j = patLen - 1;
                for(; j >= 0; j--){
                    if(myString.charAt(ii--) != pat.charAt(j))
                        break;
                }
                if(j == -1){
                    answer = myString.substring(0, i + 1);
                    break;
                }
                
            }
        }
        return answer;
    }
}