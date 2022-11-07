import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        String[] firstNum = {"2", "3", "5", "7"};  // 첫번째(가장 왼쪽) 자리 숫자 2, 3, 5, 7만 확인
        for (int i = 0; i < firstNum.length; i++) {
            backTracking(firstNum[i], N);
        }
        br.close();
    }

    public static void backTracking(String checkNum, int N) {

        if(N == checkNum.length()){
            System.out.println(checkNum);
            return;
        }

        for (int i = 1; i < 10; i+=2) { // 두번째 자리부터 1, 3, 7, 9
            String num = checkNum + i;
            if(isPrime(Integer.parseInt(num))){
                backTracking(num, N);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        int numSqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= numSqrt; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}