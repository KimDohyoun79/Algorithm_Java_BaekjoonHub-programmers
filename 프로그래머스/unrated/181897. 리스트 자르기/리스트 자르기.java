class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch(n){
            case 1 : 
                answer = makeArr(num_list, 0, slicer[1], 1); break;
            case 2 :
                answer = makeArr(num_list, slicer[0], num_list.length - 1, 1); break;
            case 3 :
                answer = makeArr(num_list, slicer[0], slicer[1], 1); break;
            case 4 :
                answer = makeArr(num_list, slicer[0], slicer[1], slicer[2]); break;
        }
        return answer;
    }
    
    private int[] makeArr(int[] num_list, int s, int e, int c){
        int[] arr = (c == 1) ? new int[e - s + 1] : new int[(e - s)/2 + 1];
    
        for(int i = 0; i < arr.length; i++)
            arr[i] = num_list[(i * c) + s];
        
        return arr;
    } 
}