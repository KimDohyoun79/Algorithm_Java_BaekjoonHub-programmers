import java.util.HashSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> hashSet = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hashSet.add(sc.nextInt());
        }


        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if(hashSet.contains(sc.nextInt()))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

}