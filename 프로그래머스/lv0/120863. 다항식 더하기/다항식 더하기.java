import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.replace("+", "").split("  ");
        
        int xNum = 0;
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("x")){
                String s = arr[i].replace("x", "");
                xNum += Integer.parseInt(s.length() > 0 ? s : "1");
            }
            else
                num += Integer.parseInt(arr[i]);
        }
        String answer = (xNum > 0 ? (xNum == 1 ? "x" : xNum + "x") : "") + 
                            (num > 0 ? (xNum > 0 ? " + " + num : num) : "");
        return answer;
    }
}