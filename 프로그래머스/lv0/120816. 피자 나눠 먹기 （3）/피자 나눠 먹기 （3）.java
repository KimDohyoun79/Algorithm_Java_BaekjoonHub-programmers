class Solution {
    public int solution(int slice, int n) {
        int i = 1;
        int pizza = slice;
        while (pizza < n) {
            i++;
            pizza = slice * i;
        }
        return i;
    }
}