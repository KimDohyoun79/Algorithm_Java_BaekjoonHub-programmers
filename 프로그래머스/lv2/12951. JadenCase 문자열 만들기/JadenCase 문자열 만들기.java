
class Solution {
    public static boolean isAlpa(char c) {

        if ('a' <= c && c <= 'z')
            return true;
        else
            return false;
    }
    
    public String solution(String s) {
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                first = true;
                sb.append(s.charAt(i));
                continue;
            }

                if (isAlpa(s.charAt(i)) && first) {
                sb.append((char) (s.charAt(i) - 32));
            } else
                sb.append(s.charAt(i));
            first = false;
        }

        String answer = String.valueOf(sb);

        return answer;
    }
}