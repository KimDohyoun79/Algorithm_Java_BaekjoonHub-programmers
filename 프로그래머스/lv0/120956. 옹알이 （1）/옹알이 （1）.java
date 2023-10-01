class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] w = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++){
            String s = babbling[i].replace(w[0], "0").replace(w[1], "0").replace(w[2], "0").replace(w[3], "0").replace("0", "");
            if(s.length() == 0)
                answer++;
        }
        return answer;
    }
}