import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 지방의 수

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {   //각 지방의 예산요청
            arr[i] = sc.nextInt();
            max = max > arr[i] ? max : arr[i];
        }

        int m = sc.nextInt();// 총 예산

        System.out.println(budget(arr, m, max));


    }

    public static int budget(int[] arr, int m, int max) {
        int left = 0;
        int right = max;

        int result = 0;
        while (left <= right) {
            int pivout = (left + right) / 2;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (pivout < arr[i])
                    sum += pivout;
                else
                    sum += arr[i];
            }
            if (m < sum) // 배정 예산의 합이 많은 경우 총예산 보다 많을 경우
                right = pivout - 1;
            else {
                left = pivout + 1;
                result = pivout > result ? pivout : result;
            }
        }
        return result;
    }
}