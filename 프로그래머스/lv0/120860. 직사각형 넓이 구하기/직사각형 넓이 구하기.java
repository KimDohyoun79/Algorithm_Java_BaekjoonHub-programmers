class Solution {
    public int solution(int[][] dots) {
        
        int[] arr = {dots[0][0], dots[0][1]};
        for(int i = 1; i < dots.length; i++){
            if(arr[0] != dots[i][0] && arr[1] != dots[i][1]){
                arr[0] = Math.abs(arr[0] > dots[i][0] ? 
                                  arr[0] - dots[i][0] : dots[i][0] - arr[0]);
                arr[1] = Math.abs(arr[1] > dots[i][1] ? 
                                  arr[1] - dots[i][1] : dots[i][1] - arr[1]);
                break;
            }
        }
        return arr[0] * arr[1];
    }
}