import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hap = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int cnt = sc.nextInt();
            hap -= money * cnt;
        }

        System.out.println(hap==0?"Yes":"No");
    }
}