class Solution {
    public int solution(String my_string) {
        
        // # 2
        int answer = 0;
        String[] numArr = my_string.replaceAll("[^0-9]", " ").split(" ");
        
 
        for(String s : numArr){
                   System.out.println(s);
            answer += s.equals("") ? 0 : Integer.valueOf(s);
        }
        
        return answer;
        
        
        
        
            // # 1
//         int answer = 0;
//         String s = "";
//         int i = 0;
        
//         while(i < my_string.length()){
            
//             // 문자가 정수인 경우 문자열에 저장
//             if(Character.isDigit(my_string.charAt(i))){
//                 s += my_string.charAt(i);
//             }
//             // 문자가 정수가 아닌 경우 이전 정수를 저장한 문자열 연산
//             else if(s.length() > 0){
//                 answer += Integer.valueOf(s);
//                 s = "";
//             }
//             i++;
//         }
//         // 문자열 마지막에 정수가 있을 경우 위에서 처리를 못하여 마지막에 확인 처리
//         return s.length() > 0 ? answer += Integer.valueOf(s) : answer;
    }
}