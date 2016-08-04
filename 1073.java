import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int i=1;
		while (i<=a) {
	     if (i%2==0) {
			System.out.println(i+"^2"+" = "+i*i);
		}
			i++;
		}

	}
}
