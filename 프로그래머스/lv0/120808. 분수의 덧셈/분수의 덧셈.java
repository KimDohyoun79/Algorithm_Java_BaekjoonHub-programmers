class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int n = num1 * num2;
        int denum = denum1 * num2 + denum2 * num1;

        for (int i = n; i >= 2; i--) {
            if (n % i == 0 && denum % i == 0) {
                n /= i;
                denum /= i;
            }
        }

        int[] answer = {denum, n};
        return answer;
    }
}