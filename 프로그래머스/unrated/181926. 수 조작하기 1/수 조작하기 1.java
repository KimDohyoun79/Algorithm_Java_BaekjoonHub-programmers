class Solution {
    public int solution(int n, String control) {
        
        for(int i = 0; i < control.length(); i++){
            n += check_alpha(control.charAt(i));
        }
        
        return n;
    }
    
    static public int check_alpha(char c){
        
        int num = 0;
        switch(c){
            case 'w' : num++; break;
            case 's' : num--; break;
            case 'd' : num += 10; break;
            case 'a' : num -= 10; break;
        }
        return num;
    } 
}