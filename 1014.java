import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
       int a;
       double b;
       a=sc.nextInt();
       b=sc.nextDouble();
       System.out.println(String.format("%.3f",(a/b))+" km/l");
    }   
}
