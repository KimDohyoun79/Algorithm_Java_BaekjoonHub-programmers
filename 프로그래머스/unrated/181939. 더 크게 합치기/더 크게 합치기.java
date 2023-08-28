class Solution { // 정수 자릿수 구하기, 제곱(Math.pow = 더블형)
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt("" + a + b), Integer.parseInt("" + b + a));
    }
}