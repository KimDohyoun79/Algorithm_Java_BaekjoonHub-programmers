class Solution {
    public int[] solution(int[] arr, int n) {
        
        int evenOrOdd = arr.length % 2 == 0 ? 1 : 0;
        
        for(int i = 0; i < arr.length; i++)
            if(i % 2 == evenOrOdd)
                arr[i] += n;
        
        return arr;
    }
}