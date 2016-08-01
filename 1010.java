import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        
       double a,f,g;
       int b,c,d,e; 
       b=sc.nextInt();
       c= sc.nextInt();
       f=sc.nextDouble();
       d= sc.nextInt();
       e=sc.nextInt();
       g=sc.nextDouble();
        a=(c*f)+(e*g);
        System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f",a));

    }    
}
