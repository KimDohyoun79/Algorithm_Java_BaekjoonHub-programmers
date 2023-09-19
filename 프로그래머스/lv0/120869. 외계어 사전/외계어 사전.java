class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean wordCheck = false;
        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) 
                    count++;
            }
            if (count == spell.length)
                return 1;
        }
        return 2;
    }
}