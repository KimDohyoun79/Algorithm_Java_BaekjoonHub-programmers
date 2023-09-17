class Solution {
    public int solution(String my_string) {
        String[] sArr = my_string.split(" ");
        int answer = Integer.valueOf(sArr[0]);
        
        for(int i = 1; i < sArr.length;i++){
            if(sArr[i].equals("+"))
                answer += Integer.valueOf(sArr[++i]);
            else
                answer -= Integer.valueOf(sArr[++i]);
        }
        
        return answer;
    }
}