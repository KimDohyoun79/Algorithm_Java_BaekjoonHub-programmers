import java.util.Scanner;

class Main {

    public static int cnt(int n) {

        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {

            if (i % 6 == 0)
                dp[i] = Math.min(dp[i / 2] + 1, dp[i / 3] + 1);
            else if (i % 2 == 0)
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1); // 10
            else if (i % 3 == 0)
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 3] + 1);

            if ((i - 1) % 2 == 0 || (i - 1) % 3 == 0) {
                if (dp[i] != 0) // 10
                    dp[i] = Math.min(dp[i], dp[i - 1] + 1);
                else    // 5, 7
                    dp[i] = dp[i - 1] + 1;
            }

        }
        return dp[n];

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(cnt(n));
    }
}