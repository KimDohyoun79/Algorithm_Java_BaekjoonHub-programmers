//https://www.acmicpc.net/problem/11654

// 문자 입력받기
// 바로 char로 받기 : char word = sc.next().charAt(0);

// 참고 : https://st-lab.tistory.com/59

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


//        #1
//        Scanner sc = new Scanner(System.in);
//        char word = sc.next().charAt(0);
//        System.out.println((int)word);

//        #2
//        Scanner sc = new Scanner(System.in);
//        int word = sc.next().charAt(0);
//        System.out.println(word);

//        #3
        int word = System.in.read();
        System.out.println(word);
    }
}