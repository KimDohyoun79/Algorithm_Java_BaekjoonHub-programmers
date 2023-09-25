class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        // #2
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < todo_list.length; i++)
            sb.append(finished[i] ? "" : todo_list[i] + " ");
        
        return sb.toString().split(" ");
               
//         // #1
//         int falseCount = 0;
//         for (boolean b : finished)
//             falseCount += b ? 0 : 1;
        
//         String[] answer = new String[falseCount];
//         int index = 0;
//         for(int i = 0; i < todo_list.length; i++){
//             if(!finished[i])
//                 answer[index++] = todo_list[i]; 
//         }
//         return answer;
        
        
    }
}