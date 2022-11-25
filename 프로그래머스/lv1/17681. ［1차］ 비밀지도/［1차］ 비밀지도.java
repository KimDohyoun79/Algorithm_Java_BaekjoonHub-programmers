import java.util.Arrays;

class Solution {
        public static String bi(int num, int n) {

        String s = "";
        while (num > 0) {
            s = num % 2 + s;
            num = num / 2;
        }
        return "0".repeat(n - s.length()) + s;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = bi(arr1[i] | arr2[i], n)
                    .replaceAll("1", "#")
                    .replaceAll("0", " ");
        }
        return answer;
    }
}