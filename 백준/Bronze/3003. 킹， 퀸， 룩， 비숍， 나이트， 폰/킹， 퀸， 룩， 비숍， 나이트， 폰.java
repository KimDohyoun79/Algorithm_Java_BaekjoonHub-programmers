import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 8};

        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]- sc.nextInt() + " ");
        }

    }
}