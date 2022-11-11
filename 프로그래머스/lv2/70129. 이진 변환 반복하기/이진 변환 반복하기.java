class Solution {
    public int[] solution(String s) {

        int oneCount = 0;
        int zeroCount = 0;
        int programCount = 0;
        
        while(!s.equals("1")){
            programCount++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1')
                    oneCount++;
                else
                    zeroCount++;
            }

            s = "";
            while (oneCount > 0) {
                s = oneCount % 2 + s;
                oneCount /= 2;
            }
        }


        int[] answer = { programCount, zeroCount};
        return answer;
    }
}