import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=1,c=0,d=0,e=0,f=0;
        while (a<=5) {
			double b=ab.nextInt();
			if (b%2==0) {
				c=c+1;
			}
			if (b>0) {
				d=d+1;
			}
			if (b<0) {
				e=e+1;
			}
			if (b%2!=0) {
				f=f+1;
			}
			a++;
		}
			System.out.println(c+" valor(es) par(es)");
			System.out.println(f+" valor(es) impar(es)");
			System.out.println(d+" valor(es) positivo(s)");
			System.out.println(e+" valor(es) negativo(s)");

	}
}
