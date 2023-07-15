//https://www.acmicpc.net/problem/10813

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = N; i > 0; i--) {
            arr[i - 1] = i;
        }
//        System.out.println(Arrays.toString(arr));

        while (M > 0) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

            M--;
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i != N - 1 ? " " : ""));
        }
    }
}