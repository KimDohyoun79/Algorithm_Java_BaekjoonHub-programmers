import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        // 가장 가까운 수가 여러 개일 경우 더 작은 수 return 위해 정렬
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
            int abs = Math.abs(n - array[i]);   // 절대값으로 비교
            if (min > abs){
                answer = array[i];
                min = abs;
            }
        }
        
        return answer;
    }
}