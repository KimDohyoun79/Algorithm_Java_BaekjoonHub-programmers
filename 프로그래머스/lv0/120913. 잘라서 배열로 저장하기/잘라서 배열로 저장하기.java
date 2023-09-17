class Solution {
    public String[] solution(String my_str, int n) {
        
        int strLen = my_str.length();
        // n으로 나누어 떨어지면 len/n을, 아니면 추가 데이터가 있으므로 len/n+1을 해준다.
        String[] answer = new String[strLen % n == 0 ? strLen / n : strLen / n + 1]; 
        
        int answerLen = answer.length;
        for (int i = 0; i < answerLen; i++){
            if(i != answerLen - 1)
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            else
                answer[i] = my_str.substring(i * n, strLen);
        }
       
        return answer;
    }
}
