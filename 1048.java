import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
double a=ab.nextDouble();
if(a>=0&&a<=400.00){
	double b=(a*15)/100;
	System.out.println("Novo salario: "+String.format("%.2f",(a+b)));
	System.out.println("Reajuste ganho: "+String.format("%.2f",b));
	System.out.println("Em percentual: 15 %");
}
if (a>=400.01&&a<=800.00) {
	double b=(a*12)/100;
	System.out.println("Novo salario: "+String.format("%.2f",(a+b)));
	System.out.println("Reajuste ganho: "+String.format("%.2f",b));
	System.out.println("Em percentual: 12 %");
}
if (a>=800.01&&a<=1200.00) {
	double b=(a*10)/100;
	System.out.println("Novo salario: "+String.format("%.2f",(a+b)));
	System.out.println("Reajuste ganho: "+String.format("%.2f",b));
	System.out.println("Em percentual: 10 %");
}
if (a>=1200.01&&a<=2000.00) {
	double b=(a*7)/100;
	System.out.println("Novo salario: "+String.format("%.2f",(a+b)));
	System.out.println("Reajuste ganho: "+String.format("%.2f",b));
	System.out.println("Em percentual: 7 %");
}
if (a>2000.00) {
	double b=(a*4)/100;
	System.out.println("Novo salario: "+String.format("%.2f",(a+b)));
	System.out.println("Reajuste ganho: "+String.format("%.2f",b));
	System.out.println("Em percentual: 4 %");
}
	}
}
