import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int x1,x2;
        x1=sc.nextInt();
        x2=sc.nextInt();
        System.out.println(String.format("%.3f",(x1*x2)/12.0));
    }   
}
