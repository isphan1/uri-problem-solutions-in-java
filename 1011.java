import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        
       double a,b;
       b=sc.nextDouble();
        a=((4/3.0)*3.14159*b*b*b);
        System.out.println("VOLUME = "+String.format("%.3f",a));

    }    
}
