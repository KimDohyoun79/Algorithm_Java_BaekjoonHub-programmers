class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;

    }
}