import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		double a=ab.nextDouble();
		double b=ab.nextDouble();
		double c=ab.nextDouble();
		double num[]=new double[3];
		double temp;
		num[0]=a;
		num[1]=b;
		num[2]=c;
	       for (int i = 0; i < num.length; i++) {
	    	   for (int j = 0; j < num.length; j++) {
	        		if(num[i]>num[j]){
	        			temp=num[i];
	        			num[i]=num[j];
	        			num[j]=temp;
	        		}
	    	   }
	       }

		if(num[0]>=num[1]+num[2]){
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if((num[0]*num[0])==(num[1]*num[1])+(num[2]*num[2])){
			System.out.println("TRIANGULO RETANGULO");
		}
		else if((num[0]*num[0])>(num[1]*num[1])+(num[2]*num[2])){
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if((num[0]*num[0])<(num[1]*num[1])+(num[2]*num[2])){
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if(num[0]==num[1]&&num[0]==num[2]&&num[1]==num[2]){
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(num[0]==num[1]&&num[0]!=num[2]||num[0]==num[2]&&num[2]!=num[1]||num[1]==num[2]&&num[1]!=num[0]){
			System.out.println("TRIANGULO ISOSCELES");
		}

	}
}
