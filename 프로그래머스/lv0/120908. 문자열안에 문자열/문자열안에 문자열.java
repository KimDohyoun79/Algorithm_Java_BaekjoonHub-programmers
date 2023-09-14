class Solution {
    public int solution(String str1, String str2) {

        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(0)){
                int j;
                for(j = 0; j < str2.length() && i + j < str1.length(); j++){
                    if(str1.charAt(i+j) != str2.charAt(j)){
                        break;
                    }
                }
                if(j == str2.length())
                    return 1;
            }
        }
        return 2;
    }
}