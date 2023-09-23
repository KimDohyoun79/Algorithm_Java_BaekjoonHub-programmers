class Solution {
    public String solution(String bin1, String bin2) {
        
        // 결과값 데이터 저장
        StringBuilder answer = new StringBuilder();
        
        // bin1, bin2의 최대 길이는 10, 연산으로 나올 수 있는 최대 길이는 11
        int[] s1 = new int[11];
        int[] s2 = new int[11];

        // 정수 배열 s1에 bin1 초기화
        int len = bin1.length();
        for(int i = 0; i < len; i++){
            s1[11 - len + i] = bin1.charAt(i) - '0';
        }
        
        // 정수 배열 s2에 bin2 초기화
        len = bin2.length();
        for(int i = 0; i < len; i++){
            s2[11 - len + i] = bin2.charAt(i) - '0';
        } 

        // s1, s2 연산 작업
        for(int i = 10; i >= 0; i--){
            s1[i] += s2[i];
            if(s1[i] == 2){
                s1[i] = 0;
                s1[i-1] += 1;
            }
            else if(s1[i] == 3){
                s1[i] = 1;
                s1[i-1] += 1;
            } 
        }
        
        // 연산 후 앞의 공간 0을 제외하고 나머지 저장
        for(int i = 0; i < 11; i++){
            if(s1[i] != 0){
                while(i < 11){
                    answer.append(s1[i++]);
                }
                break;
            }
            else if(i == 10) // 마지막까지 0이면 0 저장
                answer.append(0);
        }
        
        return answer.toString();    
    }
}