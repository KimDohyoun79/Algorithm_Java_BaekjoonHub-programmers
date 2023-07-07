import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - 45;

        if (m < 0) {
            h--;
            m = 60 + m;
        }
        if(h < 0)
            h=23;

        System.out.println(h +" "+ m);
    }
}