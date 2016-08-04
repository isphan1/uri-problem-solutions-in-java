import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=1,c=0;
		double d=0;
        while (a<=6) {
			double b=ab.nextDouble();
			if (b>0) {
				c=c+1;
				d+=b;
			}
			a++;
		}
			System.out.println(c+" valores positivos");
			System.out.println(String.format("%.1f",(d/c)));
	}
}
