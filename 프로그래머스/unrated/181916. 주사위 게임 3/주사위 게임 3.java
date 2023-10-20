import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        System.out.println(map.size());
        
        int answer = 0;
        int size = map.size();
        if(size == 1){
            answer = 1111 * a;
        }
        else if(size == 2 && map.get(a) != 2){
            int n3 = 0;
            int n1 = 0;
            for(int n : map.keySet()){
                if(map.get(n) == 3)
                    n3 = n;
                else
                    n1 = n;
            }
            answer = (10 * n3 + n1);
            answer *= answer;
        }
        else if(size == 2){
            int p = 0;
            int q = 0;
            for(int n : map.keySet()){
                if(p == 0)
                    p = n;
                else
                    q = n;
            }
            answer = (p + q) * Math.abs((p - q)); 
        }
        else if(size == 3){
            int q = 0;
            int r = 0;
            for(int n : map.keySet()){
                if(map.get(n) == 2)
                    continue;
                else if(q == 0)
                    q = n;
                else
                    r = n;
            }
            answer = q * r; 
        }
        else{
            int min = 7;
            for(int n : map.keySet()){
                if(min > n)
                    min = n;
            }
            answer = min;
        }

        return answer;
    }
}