class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        int len = A.length();
        for(int i = 0; i < len; i++){
            if(A.equals(B))
                return answer;
            else{
                A = A.substring(len - 1, len) +  A.substring(0, len - 1);
                System.out.println(A);
                answer++;
            }
        }
        return answer == len ? -1 : answer;
    }
}