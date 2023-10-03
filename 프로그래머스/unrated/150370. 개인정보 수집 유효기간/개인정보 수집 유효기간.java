import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        // 1. 기간 데이터 저장
        HashMap<Character, Integer> termsMap = new HashMap<>();
        for(String s : terms){
            termsMap.put(s.charAt(0), Integer.parseInt(s.substring(2, s.length())));
        }
        
        // 2. 오늘 날짜(문자열)를 정수로 저장
        String[] todayStr = today.split("\\.");
        int[] todayDate = {Integer.parseInt(todayStr[0]), Integer.parseInt(todayStr[1]), Integer.parseInt(todayStr[2])};
        
        // 3. 수집일자&약관 종류을 가지고 파기할 개인정보 구분
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++){
            
            // a. privacies 유효 기간 확인
            int term = termsMap.get(privacies[i].charAt(11));
            
            // b. privacies 개인정보 수집 일자를 정수형 배열에 저장
            String[] s = privacies[i].substring(0, 10).split("\\.");
            int[] termDate = {Integer.parseInt(s[0]), Integer.parseInt(s[1])+ term, Integer.parseInt(s[2]) - 1};
            
            // c. 수집일자 + 유효기간
            if(termDate[2] == 0){
                termDate[2] = 28;
                termDate[1]--; 
            }
            while(termDate[1] > 12){
                termDate[1] -= 12;
                termDate[0]++;
            }
            
            // d. 오늘 날짜와 비교하여 파기할 데이터 저장
            for(int j = 0; j < 3; j++){
                if(todayDate[j] > termDate[j]){
                    list.add(i+1);
                    break;
                }
                else if(todayDate[j] != termDate[j])
                    break;
            }
        }
        
        //4. ArrayList를 배열에 저장 후 정렬
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        Arrays.sort(answer);
        
        return answer;
    }
}