class Solution {
    public String[] solution(String[] quiz) {
        String[] answer= new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] sArr = quiz[i].split(" ");
            
            int x = Integer.parseInt(sArr[0]);
            int y = Integer.parseInt(sArr[2]);
            int z = Integer.parseInt(sArr[4]);
            
            if(sArr[1].equals("+"))
                answer[i] = (x + y == z) ? "O" : "X";
            else
                answer[i] = (x - y == z) ? "O" : "X";
        }
        return answer;
    }
}