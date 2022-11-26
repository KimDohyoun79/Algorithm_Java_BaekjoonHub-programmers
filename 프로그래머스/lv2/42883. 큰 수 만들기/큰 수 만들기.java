class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);

        int index = 0;
        int len = number.length() - k;
        while (k != 0) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == '9'){
                    continue;
                }
                if (sb.charAt(i) < sb.charAt(i + 1)) {
                    sb.delete(i, i + 1);
                    k--;
                    break;
                } else if (sb.charAt(i) >= sb.charAt(i + 1) && i == sb.length() - 2) { // 9998884
                    sb.delete(i + 1, i + 2);
                    k--;
                    break;
                }
            }
        }

        return sb.toString();
    }
}