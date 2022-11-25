import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int num: arr) {
            min = Math.min(min, num);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num: arr) {
            if(min == num)
                continue;
            else
                list.add(num);
        }

        int[] answer;

        if (arr.length -1 == 0)
            return answer = new int[]{-1};
        else
            answer = new int[arr.length-1];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}