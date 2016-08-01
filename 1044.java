import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {

		int a = ab.nextInt();
		int b = ab.nextInt();
		int aux;
	    if(a < b){
	         aux = a;
	         a = b;
	         b = aux;
	}
		if (a % b == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
