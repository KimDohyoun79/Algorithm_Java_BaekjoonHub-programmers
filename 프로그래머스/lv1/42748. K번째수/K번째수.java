import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        try {
            for (int[] arr : commands) {
                int[] tmp = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
                Arrays.sort(tmp);
                answer[cnt++] = tmp[arr[2] - 1];
            }
        } catch (Exception e) {

        }
        return answer;
    }
}