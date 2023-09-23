import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        List<Integer> list = new ArrayList<>();
        
        // 평균값 저장 
        for(int i = 0; i < score.length; i++){
            // 테스트 3, 6번 에러 : 평균값이 소수점까지 비교해야 되는 경우가 있어 *10을 하였습니다.
            score[i][0] = (score[i][0] + score[i][1]) * 10 / 2; 
            list.add(score[i][0]);
        }
        
        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        int[] answer = new int[list.size()];

        // 순차적으로 score의 각 평균을 내림차순 정렬이 된 list에서 찾아 해당 index를 순위로 계산하여 저장  
        for(int i = 0; i < score.length; i++){            
            for(int j = 0; j < list.size(); j++){
                if(score[i][0] == list.get(j)){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}