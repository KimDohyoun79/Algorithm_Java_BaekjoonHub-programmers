class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] cArr = s.toCharArray();
        int left = 0;
        for(int i = 0; i < cArr.length; i++){
            if(cArr[i] == '(')
                left++;
            else
                left--;
            if(left < 0)
                return false;
        }
        
        return left != 0 ? false : true;
    }
}