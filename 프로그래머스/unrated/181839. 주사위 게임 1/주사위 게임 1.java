class Solution {
    public int solution(int a, int b) {

        // # 2
        return (a % 2 == 0 && b % 2 == 0) 
                        ? Math.abs(a - b) : (a % 2 == 0 || b % 2 == 0) 
                                                        ? 2 * (a + b) : a*a + b*b;
        
        // # 1
        // if(a % 2 == 0 && b % 2 == 0)
        //     return Math.abs(a - b);
        // else if (a % 2 == 0 || b % 2 == 0)
        //     return 2 * (a + b);
        // else
        //     return a*a + b*b;

    }
}