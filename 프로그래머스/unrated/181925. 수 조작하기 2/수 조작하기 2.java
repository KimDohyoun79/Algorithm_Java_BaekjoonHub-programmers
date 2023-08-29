class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        // #2
        for(int i = 1; i < numLog.length; i++){
           answer = (numLog[i - 1] < numLog[i]) ? 
            (numLog[i - 1] + 1 == numLog[i] ? answer.append("w") : answer.append("d")) : //1, 10
            (numLog[i - 1] - 1 == numLog[i] ? answer.append("s") : answer.append("a")); //-1, -10
        }
        
        // #1
        // for(int i = 1; i < numLog.length; i++){
        //     if(numLog[i - 1] < numLog[i]){ // 1, 10
        //         if(numLog[i - 1] + 1 ==numLog[i])
        //             answer.append("w");
        //         else
        //             answer.append("d");
        //     }
        //     else{ // -1, -10
        //         if(numLog[i - 1] - 1 ==numLog[i])
        //             answer.append("s");
        //         else
        //             answer.append("a");
        //     }
        // }
        return answer.toString();
    }
}
