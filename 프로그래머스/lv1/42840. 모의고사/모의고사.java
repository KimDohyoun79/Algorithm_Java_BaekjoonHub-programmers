import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] cnt = {0, 0, 0};

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5])
                cnt[0]++;
            if (answers[i] == two[i % 8])
                cnt[1]++;
            if (answers[i] == three[i % 10])
                cnt[2]++;
        }

        int max = 0;
        for (int cntNum: cnt) {
            if(cntNum >= max){
                max = cntNum;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if(max == cnt[i]){
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}