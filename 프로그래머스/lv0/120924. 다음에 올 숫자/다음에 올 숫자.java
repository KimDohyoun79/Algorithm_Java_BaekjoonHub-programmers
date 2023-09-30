class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1] - common[0] == common[2] - common[1])
            answer = common[common.length - 1] + common[1] - common[0];
        else{
            int i = 1;
            while(true){
                if(common[0] * i == common[1]){
                    answer = i;
                    break;
                }
                i++;
            }
            answer *= common[common.length - 1];
        }
        return answer;
    }
}