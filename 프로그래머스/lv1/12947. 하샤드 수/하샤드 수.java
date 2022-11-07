class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int tmpX = x;
        while (tmpX > 0) { // 자릿수의 합 구하기
            sum += tmpX % 10;
            tmpX /= 10;
        }

        try {
            if (x % sum != 0) // 나누어 떨어지는지 check하기
                answer = false;
        } catch (ArithmeticException e) {
        }

        return answer;
    }
}