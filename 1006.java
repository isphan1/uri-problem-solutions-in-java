import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Scanner sp=new Scanner(System.in);
        Scanner sk=new Scanner(System.in);


        double a,b,c,d;
       b= sc.nextDouble();
       c= sc.nextDouble();
       d= sc.nextDouble();

        a=((b*2)+(c*3)+(d*5))/(2+3+5);
        System.out.println("MEDIA = "+String.format("%.1f",a));
    }    
}
