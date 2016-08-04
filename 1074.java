import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int i=1;
		while (i<=a) {
			int b=ab.nextInt();
	     if (b%2==0&&b>0) {
			System.out.println("EVEN POSITIVE");
		}
	     if (b%2!=0&&b>0) {
			System.out.println("ODD POSITIVE");
		}
	     if (b%2==0&&b<0) {
			System.out.println("EVEN NEGATIVE");
		}
	     if (b%2!=0&&b<0) {
			System.out.println("ODD NEGATIVE");
		}
	     if (b==0) {
			System.out.println("NULL");
		}
			i++;
		}

	}
}
