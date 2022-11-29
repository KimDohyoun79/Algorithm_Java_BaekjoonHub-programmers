class Solution {
    public int solution(int n) {
      int i = 1;
        int pizza = 6;
        while (pizza % n != 0) {
            i++;
            pizza = 6 * i;
        }
        return i;
    }
}