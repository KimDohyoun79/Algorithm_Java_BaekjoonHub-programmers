class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int person : array){
            if(height < person)
                answer++;
        }
        return answer;
    }
}