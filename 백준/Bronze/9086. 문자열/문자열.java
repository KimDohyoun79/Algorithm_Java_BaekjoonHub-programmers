//https://www.acmicpc.net/problem/1546
// next() : 스페이스&개행기준
// nextLine() : 개행기준
// 문자 + 문자 = 정수로 출력

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0) +""+ str.charAt(str.length() - 1));
        }
    }
}