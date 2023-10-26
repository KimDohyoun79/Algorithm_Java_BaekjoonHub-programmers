import java.util.Scanner;

public class Main {

       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int w = sc.nextInt(), h = sc.nextInt();

        int min = (x - 0 > w - x ? w - x : x - 0);
        int min2 = (y - 0 > h - y ? h - y : y - 0);
        System.out.println(Math.min(min, min2));
    
    }

}