class Solution {
    public String[] solution(String[] picture, int k) {
        
        int len = picture.length;
        String[] answer = new String[len * k];
        
        int index = 0;
        for(int i = 0; i < len; i++){
            String s = makeStr(picture[i], k);
            for(int j = 0; j < k; j++){
               answer[index++] = s; 
            }
        }
        return answer;
    }
    
    private String makeStr(String str, int k){
        String[] arrStr = str.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arrStr.length; i++){
            sb.append(arrStr[i].repeat(k));
        }
        return sb.toString();
    }
}