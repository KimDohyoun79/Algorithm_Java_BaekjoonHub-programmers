import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] arr = emergency.clone();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == emergency[j])
                    answer[j] = emergency.length - i;
            }
        }

        return answer;
    }
}