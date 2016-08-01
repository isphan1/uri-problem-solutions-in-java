import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
       double a,b,c;
       a=sc.nextDouble();
       b=sc.nextDouble();
       c=sc.nextDouble();
       
       System.out.println("TRIANGULO: "+String.format("%.3f",a*c*.5));
       System.out.println("CIRCULO: "+String.format("%.3f",c*c*3.14159));
       System.out.println("TRAPEZIO: "+String.format("%.3f",((a+b)*c*.5)));
       System.out.println("QUADRADO: "+String.format("%.3f",b*b));
       System.out.println("RETANGULO: "+String.format("%.3f",a*b));
    }    
}
