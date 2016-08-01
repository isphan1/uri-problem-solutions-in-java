import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        
       double a,c,d;
       String b;
       b=sc.nextLine();
       c= sc.nextDouble();
       d= sc.nextDouble();

        a=(c+(d*15)/100);
        System.out.println("TOTAL = R$ "+String.format("%.2f",a));

    }    
}
