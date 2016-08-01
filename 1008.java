import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Scanner sp=new Scanner(System.in);
        Scanner sk=new Scanner(System.in);


        double a,d;
        int b,c;
       b= sc.nextInt();
       c= sc.nextInt();
       d= sc.nextDouble();

        a=(c*d);
        System.out.println("NUMBER = "+b);
        System.out.println("SALARY = U$ "+String.format("%.2f",a));

    }    
}

