import java.util.Scanner; 
public class Main {
static Scanner ab = new Scanner(System.in);
	public static void main(String[] args) {
	 
		 Double a = ab.nextDouble();
		 Double b = ab.nextDouble();
		 Double c = ab.nextDouble();
		 if (a+b>c&&b+c>a&&a+c>b){
			 System.out.println("Perimetro = "+String.format("%.1f",a+b+c));
		 }
		 else{
			 System.out.println("Area = "+String.format("%.1f",((a+b)*c)/2));
		 }


		}
	}
