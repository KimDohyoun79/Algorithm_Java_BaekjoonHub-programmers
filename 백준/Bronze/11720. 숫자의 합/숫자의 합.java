//https://www.acmicpc.net/problem/2743

// 문자 => 정수 형변환
// 문자열에서 charAt()을 사용하여 문자로 출력하면 아스키코드로 출력됨
// 아스키코드값으로 변환 : word - '0'
// 함수 사용 : Character.getNumericValue(str.charAt(i));
//참고 : https://dlee0129.tistory.com/230


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int hap = 0;

        for (int i = 0; i < str.length(); i++) {
            hap += Character.getNumericValue(str.charAt(i));
        }

        System.out.println(hap);
    }
}