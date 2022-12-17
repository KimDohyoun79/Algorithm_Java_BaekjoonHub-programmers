import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> dec = new ArrayDeque<>();

        for ( int num: numbers) {
            dec.add(num);
        }

        if (direction.equals("right")) {
            dec.addFirst(dec.getLast());
            dec.pollLast();
        }
        else{
            dec.addLast(dec.getFirst());
            dec.pollFirst();
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = dec.pollFirst();
        }

        return numbers;
    }
}