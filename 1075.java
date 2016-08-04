import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int i=2;
		while(i<10000){
			System.out.println(i);
			i+=a;
		}

	}
}
