class Solution {
    public int solution(int[][] lines) {
        
        int[] arr = new int[201];
        for(int i = 0; i < 3; i++){
            for(int j = lines[i][0]; j < lines[i][1]; j++){
                arr[j + 100]++;
            }
        }
        
        int answer = 0;
        for(int i = 0; i < 201; i++){
            if(arr[i] > 1)
                answer++;
        }
        
        return answer;
    }
}