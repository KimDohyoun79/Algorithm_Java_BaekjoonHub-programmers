class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            while(s < e){
                String first = str[s];
                str[s++] = str[e];
                str[e--] = first;
            }
        }
        
        return String.join("", str);
    }
}