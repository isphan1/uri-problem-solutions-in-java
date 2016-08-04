import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=1,c=0;
        while (a<=5) {
			double b=ab.nextInt();
			if (b%2==0) {
				c=c+1;
			}
			a++;
		}
			System.out.println(c+" valores pares");
	}
}
