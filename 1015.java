import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        double x1,y1,x2,y2,r,po;
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        r=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        po=Math.sqrt(r);
        System.out.println(String.format("%.4f",po));
    }   
}
