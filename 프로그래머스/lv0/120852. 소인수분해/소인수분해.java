import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        // 중복값 제거를 위해 HashSet을 사용
        HashSet<Integer> set = new HashSet<>();

        // n을 소수로 나누어질 수 없을 때까지 나누기
        while(n > 1){
            for(int i = 2; i <= n; i++){
                if(decimal(i) && n % i == 0){ // 소수로 나누어 지면 HashSet에 저장
                    set.add(i);
                    n /= i;
                }
            }     
        }
        
        // 결과 데이터 출역을 위해 배열에 저장
        int[] answer = new int[set.size()];
        int i = 0;
        for(int num : set){
             answer[i++] = num; 
        }
        
        // ! HashSet의 비정렬로 테스트 13번에서 에러 발생
        Arrays.sort(answer);
        
        return answer;
    }
    
    // 소수 체크
    public boolean decimal(int num){
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}