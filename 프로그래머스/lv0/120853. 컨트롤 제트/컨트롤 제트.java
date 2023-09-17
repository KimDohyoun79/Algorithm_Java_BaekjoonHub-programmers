class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split(" ");
        
        for(int i = sArr.length - 1; i >=0; i--){
            if(!sArr[i].equals("Z"))
                answer += Integer.valueOf(sArr[i]);
            else
                i--;
        }
        
        return answer;
    }
}