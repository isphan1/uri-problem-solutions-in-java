import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(i+" x "+a+" = "+(i*a));
			i++;
		} 
	}
}
