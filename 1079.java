import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		double c=0;
		double num[]=new double [3];
for (int k = 1; k <=a; k++) {
	c=0;
	for (int i = 0; i <=2; i++) {
       double n=ab.nextDouble();
       num[i]=n;
	}
	c=num[0]*2+num[1]*3+num[2]*5;
	System.out.println(String.format("%.1f",(c/10.0)));
}
	}
}
