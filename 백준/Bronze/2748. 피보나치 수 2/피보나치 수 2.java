import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		long num = sc.nextLong();
		
		Long a=0L, b=1L, c = 1L;
		int count=1;
		
		while(count!=num) {
			c= a+b;
			count++;
			a=b;
			b=c;
		}
		
		System.out.print(c);
		sc.close();
	}
}
