import java.io.IOException;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
       int a,b,c;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>b&&a>c){
    	   System.out.println(a+" eh o maior");
       }
       else if(b>c){
    	   System.out.println(b+" eh o maior");
       }
       else{
    	   System.out.println(c+" eh o maior");
       }
    }    
}
