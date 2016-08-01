import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,R;
       R= sc.nextDouble();
        a=(R*R*3.14159);
        System.out.println("A="+String.format("%.4f",a));
    }    
}
