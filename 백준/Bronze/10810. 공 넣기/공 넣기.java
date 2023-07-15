//https://www.acmicpc.net/problem/10810

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        while (M > 0) {
            Arrays.fill(arr, sc.nextInt() - 1, sc.nextInt(), sc.nextInt());
            M--;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i != N - 1 ? " " : ""));
        }
    }
}