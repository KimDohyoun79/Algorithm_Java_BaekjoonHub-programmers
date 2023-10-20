import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = l;
        while(i <= r){
            if(checkNum(i))
                list.add(i);
             i = (i % 5 == 0) ? (i + 5) : (i + 1);
        }
        System.out.println(list);
        
        
        int[] answer;
        int size = list.size();
        if(size == 0)
            answer = new int[]{-1};
        else{
            answer = new int[size];
            for(int k = 0; k < size ; k++)
                answer[k] = list.get(k);
        }

        return answer;
    }
    
    
    
    private boolean checkNum(int num){
        
        while(num > 0){
            if(num % 10 != 0 && num % 10 != 5)
                return false;
            num /= 10;
        }
        
        return true;
    }
}