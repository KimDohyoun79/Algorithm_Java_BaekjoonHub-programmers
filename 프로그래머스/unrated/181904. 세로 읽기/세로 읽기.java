class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            if(i == c - 1){
                s.append(my_string.charAt(i));
                c +=m;
            }
        }
        return s.toString();
    }
}