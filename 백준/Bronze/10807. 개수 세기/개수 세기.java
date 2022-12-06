import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        int num = sc.nextInt();

        int cnt =0;
        for (int getnum : arr ) {
            if(getnum==num)
                cnt++;
        }

        System.out.println(cnt);

    }
}