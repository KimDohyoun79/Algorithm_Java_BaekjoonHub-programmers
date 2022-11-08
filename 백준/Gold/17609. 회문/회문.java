//https://furtive-hollyhock-f4c.notion.site/203a4101975e4cf4a43edc9f38bd86b4
import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String word = sc.next();

            int front = 0;
            int end = word.length() - 1;

            while (front <= end) {
                if (word.charAt(front) == (word.charAt(end))) { //abba 와 같은 완전 회문 검사
                    if(++front > --end)
                        System.out.println(0);
                }
                else{ // 완전 회문 검사에서 틀린 문자가 오면 유사 회문인지 확인하여 맞으면 1을 출력, 아니라면 2를 출력
                    if (checkFrontEnd(word, front + 1, end)) { // 체크할 앞 문자를 1 증가시켜 끝 문자와 비교
                        System.out.println(1);
                    } else if (checkFrontEnd(word, front, end - 1)) { // 체크할 끝 문자를 1감소시켜 앞 문자와 비교
                        System.out.println(1);
                    } else
                        System.out.println(2);  // 유사회문도 아니라면 2를 출력
                    break;
                }
            }
        }
    }

    public static boolean checkFrontEnd(String word, int front, int end) {
        while (front <= end) {
            if (word.charAt(front) == (word.charAt(end))) {
                front++;
                end--;
            } else
                return false;
        }
        return true;
    }
}