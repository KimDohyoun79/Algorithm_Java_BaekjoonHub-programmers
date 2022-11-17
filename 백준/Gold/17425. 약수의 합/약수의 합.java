
import java.io.*;
import java.util.Arrays;

public class Main {
    final static int MAX_SIZE = 1000001;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] dp = new long[MAX_SIZE];
        int t = Integer.parseInt(br.readLine());
        Arrays.fill(dp,1);
        for (int i = 2; i < MAX_SIZE; i++){
            for (int j = 0; j * i < MAX_SIZE; j++){
                dp[j * i] += i;
            }
            dp[i] = dp[i-1] + dp[i];
        }
        while (t>0){
            t--;
            sb.append(dp[Integer.parseInt(br.readLine())] + "\n");
        }
        System.out.println(sb);
    }
}