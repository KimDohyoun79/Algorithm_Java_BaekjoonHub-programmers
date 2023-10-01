class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        board[0] /= 2;
        board[1] /= 2;
        
        for(String s : keyinput){
            switch(s){
                case "left" : 
                    if(board[0] * -1 < answer[0]) 
                        answer[0]--; 
                    break;
                case "right" : 
                    if(answer[0] < board[0])
                        answer[0]++;
                    break;
                case "up" : 
                    if(answer[1] < board[1])
                        answer[1]++;
                    break;  
                case "down" : 
                    if(board[1] * -1  < answer[1])
                        answer[1]--;
                    break;
                    
            }
        }
        return answer;
    }
}