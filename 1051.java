import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		double a = ab.nextDouble();
		if (a <= 2000.00) {
			System.out.println("Isento");
		} 
		else if (a >= 2000.01 && a <= 3000.00) {
		System.out.println("R$ "+String.format("%.2f",(a-2000)*.08));
		}
		else if (a>=3000.01&&a<=4500.00) {
			System.out.println("R$ "+String.format("%.2f",((a-3000)*.18)+(1000*.08)));

		}
		else if (a>=4500.01) {
			System.out.println("R$ "+String.format("%.2f",((a-4500)*.28)+(1500*.18)+(1000*.08)));

		}

	}
}
