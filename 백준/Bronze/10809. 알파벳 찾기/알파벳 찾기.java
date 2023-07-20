//https://www.acmicpc.net/problem/10809

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int alpha[] = new int[26];
        Arrays.fill(alpha, -1);

        for (int i = 0; i < str.length(); i++) {
            int wordIndex = str.charAt(i) - 'a';
            if (alpha[wordIndex] == -1){
                alpha[wordIndex] = i;
            }
        }
        System.out.println(Arrays.toString(alpha).replace(", ", " ").replaceAll("[\\[\\]]", ""));
    }
}