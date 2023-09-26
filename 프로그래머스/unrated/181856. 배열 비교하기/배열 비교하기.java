class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        if (len1 == len2){
            int sum = 0;
            for(int i = 0; i < len1; i++)
                sum += arr1[i] - arr2[i];
            return sum == 0 ? 0 : (sum > 0 ? 1 : -1);
        }
        else
            return len1 > len2 ? 1 : -1;

    }
}