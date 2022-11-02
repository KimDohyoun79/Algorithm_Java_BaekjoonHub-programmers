import java.util.LinkedList;
import java.util.List;
class Solution {
    public int solution(int num) {

        boolean[] numArr = new boolean[num+1];// 0 ~ num 까지 담을 배열

        numArr[0] = numArr[1] = true;   // 0과 1은 소수가 아니므로 true
        for (int i = 2; i <= Math.sqrt(num); i++) {
            for (int j = i; j <= num; j+=i) {
                if (j % i == 0 && j / i != 1)
                    numArr[j] = true;   // 소수가 아니면 true
            }
        }

        int cnt =0;
        for (int i = 0; i <= num; i++) {
            if(!numArr[i])
                cnt++;
        }

        //long end = System.nanoTime();
        //System.out.println("isPrimeEratos 실행시간 : " + (end - start) / 10000000.0);

        return cnt;
    }
}