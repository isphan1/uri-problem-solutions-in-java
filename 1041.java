import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);
	public static void main(String[] args) {
	 
		 double a= ab.nextDouble();
		 double b=ab.nextDouble();
		 if (a==0.0&&b==0.0){
			 System.out.println("Origem");
		 }
		 if(a==0.0&&b!=0.0){
			 System.out.println("Eixo Y");
		 }
		 if (a!=0.0&&b==0.0) {
			 System.out.println("Eixo X");
		}
		 if (a>0.0&&b>0.0) {
			System.out.println("Q1");
		}
		 if (a<0.0&&b>0.0) {
			System.out.println("Q2");
		}
		 if (a<0.0&&b<0.0) {
			System.out.println("Q3");
		}
		 if (a>0.0&&b<0.0) {
			System.out.println("Q4");
		}
	}
}
