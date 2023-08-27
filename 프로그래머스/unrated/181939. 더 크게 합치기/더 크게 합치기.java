class Solution { // 정수 자릿수 구하기, 제곱(Math.pow = 더블형)
    public int solution(int a, int b) {
        int case1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int case2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return case1 > case2 ? case1 : case2;
    }
}