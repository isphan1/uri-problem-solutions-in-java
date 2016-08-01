import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Float a;
		a=sc.nextFloat();
		if (a<0.0000) {
			System.out.println("Fora de intervalo");
		}
		else if(a>=0.0000&&a<=25.0000){
			System.out.println("Intervalo [0,25]");
		}
		else if(a>=25.00001&&a<=50.0000){
			System.out.println("Intervalo (25,50]");
		}
		else if(a>=50.00001&&a<=75.0000){
			System.out.println("Intervalo (50,75]");
		}
		else if(a>=75.00001&&a<=100.0000){
			System.out.println("Intervalo (75,100]");
		}
		else if (a>100.0000) {
			System.out.println("Fora de intervalo");

		}

	}
}
