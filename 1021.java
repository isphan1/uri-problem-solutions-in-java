import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {

		double b = ab.nextDouble();
		int n;
		n = (int) (b / 100);

		System.out.println("NOTAS:");
		
		System.out.println(n + " nota(s) de R$ 100.00");
		b %= 100;
		
		n = (int) (b / 50);
		System.out.println(n + " nota(s) de R$ 50.00");
		b %= 50;

		n = (int) (b / 20);
		System.out.println(n + " nota(s) de R$ 20.00");
		b %= 20;

		n = (int) (b / 10);
		System.out.println(n + " nota(s) de R$ 10.00");
		b %= 10;

		n = (int) (b / 5);
		System.out.println(n + " nota(s) de R$ 50.00");
		b %= 5;

		n = (int) (b / 2);
		System.out.println(n + " nota(s) de R$ 2.00");
		b %= 2;
		System.out.println("MOEDAS:");
		n = (int) (b / 1);
		System.out.println(n + " moeda(s) de R$ 1.00");
		b %= 1;

		n = (int) (b / .50);
		System.out.println(n + " moeda(s) de R$ 0.50");
		b %= .50;

		n = (int) (b / .25);
		System.out.println(n + " moeda(s) de R$ 0.25");
		b %= .25;

		n = (int) (b / .10);
		System.out.println(n + " moeda(s) de R$ 0.10");
		b %= .10;

		n = (int) (b / .05);
		System.out.println(n + " moeda(s) de R$ 0.05");
		b %= .05;

		n = (int) (b / .01);
		System.out.println(n + " moeda(s) de R$ 0.01");
	}
}

