import java.util.*;

class Solution {
    public String solution(String s) {

        char[] cArr = s.toCharArray();
        int index = 0;
        for(int i = 0; i < cArr.length; i++){
            if(cArr[i] != ' '){
                if(index++ % 2 == 0)  //짝수, 소문자면 대문자, a=97
                    cArr[i] = ('a' <= cArr[i]) ? (char)(cArr[i] - 32) : cArr[i];
                else    // 홀수, 대문자면 소문자, A=65
                    cArr[i] = (cArr[i] <= 'Z') ? (char)(cArr[i] + 32) : cArr[i];
            }
            else
                index = 0;
                
                
        }
        return String.valueOf(cArr);
    }
}