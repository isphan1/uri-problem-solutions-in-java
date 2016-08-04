import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int n=1;
		if (a>=1&&a<=1000) {
			while(n<=a){
				if(n%2!=0){
					System.out.println(n);
				}
				n++;
			}
		}
        
	}
}
