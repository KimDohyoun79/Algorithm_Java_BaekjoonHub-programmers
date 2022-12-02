import java.util.Scanner;

class Main {

    public static int cal(int a, int b, int c) {

        int num = 0;
        if (a == b && b == c)
            num = 10000 + a * 1000;
        else if (a == b || a == c || b == c) {
            if (a == b) num = 1000 + a * 100;
            if (a == c) num = 1000 + a * 100;
            if (b == c) num = 1000 + b * 100;
        } else
            num = Math.max(Math.max(a, b), c) * 100;
        return num;
    }


    public static void main(String[] args) {

//        System.out.println(cal(3, 3, 6)); // 1300
//        System.out.println(cal(2, 2, 2)); // 12000
//        System.out.println(cal(6, 2, 5)); // 600
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(cal(a, b, c));
    }
}