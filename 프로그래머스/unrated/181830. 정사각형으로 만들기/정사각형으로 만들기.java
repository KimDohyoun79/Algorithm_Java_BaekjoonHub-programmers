class Solution {
    public int[][] solution(int[][] arr) {
 
        int r = arr[0].length;
        int c = arr.length;
        
        if(r == c)
            return arr;
        int max = r > c ? r : c;
        
        int[][] answer = new int[max][max];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}