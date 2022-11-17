import java.util.Scanner;

/*
4 2
10 11
=> 5

5 3
2 5 10
=> 2

6 6
5 5 5 4 5 7
=> 4

4 10
9 10 120 40 55 12 40 50 60 10
=> 55

모든 조카에게 나눠줄 수 없으면 0 / 런타임 에러 by zero
10  3
1 1 1
=> 0
 */
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nephewM = sc.nextInt();
        int snackN = sc.nextInt();

        int[] arr = new int[snackN];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < snackN; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(binarySearch01(1, max, nephewM, arr));

    }

    public static int binarySearch01(int left, int right, int M, int[] arr) {

        int result = 0;
        while (left <= right) {
            int pivot = (left + right) / 2;
            int cnt = 0;


            for (int i = arr.length - 1; i >= 0; i--) {
                cnt += arr[i] / pivot;
                if (cnt >= M)
                    break;
            }

            if (cnt >= M) {
                result = pivot;
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return result;
    }
}