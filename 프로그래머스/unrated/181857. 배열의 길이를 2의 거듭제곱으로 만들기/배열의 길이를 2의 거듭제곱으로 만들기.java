class Solution {
    public int[] solution(int[] arr) {
        
        int arrLen = arr.length;
        
        int newLen = 2;
        while(arrLen > newLen)
            newLen *= 2;
        
        if(arrLen == newLen || arrLen == 1)
            return arr;
        
        int[] answer = new int[newLen];
        for(int i = 0; i < arrLen; i++)
            answer[i] = arr[i];
        
        return answer;
    }
}