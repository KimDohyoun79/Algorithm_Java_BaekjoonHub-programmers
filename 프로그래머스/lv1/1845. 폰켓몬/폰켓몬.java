import java.util.HashSet;

/**
 * 1. 가질 수 있는 폰켓몬 수 구하기 (num.length)
 * 2. 폰켓몬 종류 구하기 (set 사용)
 * 3. 폰켓몬 수/2 > 폰켓몬 종류 ? 폰켓몬 종류 : 폰켓몬 수/2
 */

class Solution {
    public int solution(int[] nums) {
        HashSet set = new HashSet();

        // 2.
        for (int num : nums) {
            set.add(num);
        }

        // 1. 3.
        return nums.length / 2 > set.size() ? set.size() : nums.length / 2;
    }
}