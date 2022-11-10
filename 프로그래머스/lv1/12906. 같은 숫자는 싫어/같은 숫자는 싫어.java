import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> data = new Stack<>();

        int i = 1;
        data.add(arr[0]);
        while (i < arr.length) {
            if (data.peek() != arr[i]) {
                data.add(arr[i]);
            }
            i++;
        }

        int[] answer = new int[data.size()];

        for (int j = 0; j < data.size(); j++) {
            answer[j] = data.get(j);
        }
        return answer;
    }
}