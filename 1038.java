import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
         int x,y;
         y=sc.nextInt();
         x=sc.nextInt();
         if (y==1) {
			System.out.println("Total: R$ "+String.format("%.2f",x*4.00));
		}
         else if (y==2) {
 			System.out.println("Total: R$ "+String.format("%.2f",x*4.50));
		}
         else if (y==3) {
 			System.out.println("Total: R$ "+String.format("%.2f",x*5.00));
		}
         else if (y==4) {
 			System.out.println("Total: R$ "+String.format("%.2f",x*2.00));
		}
         else if (y==5) {
 			System.out.println("Total: R$ "+String.format("%.2f",x*1.50));
		}
}
}
