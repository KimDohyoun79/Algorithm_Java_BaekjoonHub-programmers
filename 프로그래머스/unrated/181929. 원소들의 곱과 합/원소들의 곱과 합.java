class Solution {
    public int solution(int[] num_list) {
        
        int hap = 0, multi = 1;
        for( int num : num_list){
            hap += num;
            multi *= num;
        }
        return multi < (int)Math.pow(hap, 2) ? 1 : 0;
    }
}