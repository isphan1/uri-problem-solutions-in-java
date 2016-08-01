import java.io.IOException;
import java.util.Scanner;

import javax.lang.model.type.NullType;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double a,b,c,e,f,g,h;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		e=(b*b)-4*a*c;
		f=Math.sqrt(e);
		g=((-b)+f)/(2*a);
		h=((-b)-f)/(2*a);
		if((e>0&&a!=0)){
	    System.out.println("R1 = "+String.format("%.5f",g));
		System.out.println("R2 = "+String.format("%.5f",h));
		}
		else{
			System.out.println("Impossivel calcular");
		}
	}
}
