class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        while (--k > 0) {

            if (index == numbers.length - 2)
                index = 0;
            else if (index == numbers.length-1) {
                index = 1;
            }
            else
                index +=2;
        }

        return numbers[index];
    }
}