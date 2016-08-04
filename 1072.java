import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int i=1;
		int c=0;
		int o=0;
		while (i<=a) {
			int b=ab.nextInt();
			if (b>=10&&b<=20) {
				c+=1;
			}
			else {
				o+=1;
			}
			i++;
		}
		System.out.println(c+" in");
		System.out.println(o+" out");

	}
}
