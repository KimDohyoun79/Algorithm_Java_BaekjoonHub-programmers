import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        // 기간 데이터 저장
        HashMap<Character, Integer> termsMap = new HashMap<>();
        for(String s : terms){
            termsMap.put(s.charAt(0), Integer.parseInt(s.substring(2, s.length())));
        }
        
        System.out.println(termsMap);
        
        // 오늘 날짜 정수로 변환
        String[] todayStr = today.split("\\.");
        int[] todayDate = {Integer.parseInt(todayStr[0]), Integer.parseInt(todayStr[1]), Integer.parseInt(todayStr[2])};
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++){
            int term = termsMap.get(privacies[i].charAt(11));
            String[] s = privacies[i].substring(0, 10).split("\\.");
            int[] termDate = {Integer.parseInt(s[0]), Integer.parseInt(s[1])+ term, Integer.parseInt(s[2]) - 1};
            
            System.out.println("today : " + Arrays.toString(s));
            System.out.println("before : " + Arrays.toString(termDate));
            if(termDate[2] == 0){
                termDate[2] = 28;
                termDate[1]--; 
            }
            while(termDate[1] > 12){
                termDate[1] -= 12;
                termDate[0]++;
                
            }
            
            System.out.println("after : " + Arrays.toString(termDate) +"\n");
            for(int j = 0; j < 3; j++){
                if(todayDate[j] > termDate[j]){
                    list.add(i+1);
                    break;
                }
                else if(todayDate[j] != termDate[j])
                    break;
            }
        }
        
        // ArrayList를 배열에 저장 후 정렬
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        Arrays.sort(answer);
        
        return answer;
    }
    
    
}