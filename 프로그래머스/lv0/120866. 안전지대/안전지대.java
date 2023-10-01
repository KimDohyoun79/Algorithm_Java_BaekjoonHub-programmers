import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        boolean[][] den = new boolean[len][len];     
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < len; j++){
                if(board[i][j] == 1){    
                    int upDown = (0 <= i - 1 ? i - 1 : 0);
                    for(;upDown < i + 2 && upDown < len; upDown++){
                        int leftRight = (0 <= j - 1 ? j - 1 : 0);
                        for(;leftRight < j+2 && leftRight < len; leftRight++)
                            den[upDown][leftRight] = true;
                    }
                }       
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < len; j++){
                if(!den[i][j])
                    answer++;
                System.out.print(den[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        return answer;
    }
}