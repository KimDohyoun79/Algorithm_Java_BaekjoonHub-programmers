class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        if(x1 | x2)
            x1 = true;
        else
            x1 = false;
        
        if(x3 | x4)
            x3 = true;
        else
            x3 = false;
        
        answer = x1 & x3;
        return answer;
    }
}