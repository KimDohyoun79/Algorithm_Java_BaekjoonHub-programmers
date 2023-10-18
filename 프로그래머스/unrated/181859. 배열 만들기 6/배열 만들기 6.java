import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stack.empty() || stack.peek() != arr[i])
                stack.push(arr[i]);
            else
                stack.pop();
        }
        
        if(stack.empty())
            answer = new int[] {-1};
        else{
            int size = stack.size();
            answer = new int[size];
            for(int i = size - 1; i >= 0; i--)
                answer[i] = stack.pop();
        }
        
        return answer;
    }
}