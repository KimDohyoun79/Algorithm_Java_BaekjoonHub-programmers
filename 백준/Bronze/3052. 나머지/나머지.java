import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n[] = new int[42];
        int result = 0;

        for (int i = 0; i < 10; i++) {
            n[sc.nextInt() % 42]++;
        }

        for (int i = 0; i < n.length; i++) {
            if(n[i]>0)
                result++;
        }

        System.out.println(result);
    }
}