class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
        for(int n : arr)
            sum += n;
        
        int[] answer = new int[sum];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            while(n-- > 0)
                answer[index++] = arr[i];
        }
            
        return answer;
    }
}