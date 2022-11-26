import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            arrMap.put(array[i], arrMap.getOrDefault(array[i], 1)+1);
        }

        System.out.println(arrMap);
        int maxKey = 0;
        int maxValue = -1;
        for (int key: arrMap.keySet()) {
            if(maxValue < arrMap.get(key)) {
                System.out.println(key);
                maxValue = arrMap.get(key);
                maxKey = key;
            }
        }

        for (int key: arrMap.keySet()) {
            if(maxValue == arrMap.get(key) && key!=maxKey) {
                return -1;
            }
        }

        return maxKey;
    }
}