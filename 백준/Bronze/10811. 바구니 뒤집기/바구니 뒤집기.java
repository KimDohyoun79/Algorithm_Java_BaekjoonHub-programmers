//https://www.acmicpc.net/problem/10811

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        while (M > 0) {
            int i = sc.nextInt()-1, j = sc.nextInt()-1;
            if (j - i > 0) {
                for (int n = (j - i + 1) / 2; n > 0; n--) { // 숫자 갯수/2 = 앞뒤 번호 교환 횟수
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            }
            M--;
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i != N - 1 ? " " : ""));
        }
    }
}