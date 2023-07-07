import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt() + m;

        h += t / 60;
        m = t % 60;

        System.out.println((h > 23 ? h % 24 : h) + " " + m);
    }
}