import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Scanner sp=new Scanner(System.in);

        double a,b,c;
       b= sc.nextDouble();
       c= sc.nextDouble();
        a=((b*3.5)+(c*7.5))/(3.5+7.5);
        System.out.println("MEDIA = "+String.format("%.5f",a));
    }    
}
