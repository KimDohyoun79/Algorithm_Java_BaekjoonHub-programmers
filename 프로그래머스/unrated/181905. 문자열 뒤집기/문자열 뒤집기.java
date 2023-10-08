class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            if(i != s)
                sb.append(my_string.charAt(i));
            else{
                while(e >= s){
                   sb.append(my_string.charAt(e--));
                   i++;
                }
                i--;
            }
        }
        return sb.toString();
    }
}