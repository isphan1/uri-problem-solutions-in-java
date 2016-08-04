import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=ab.nextInt();
		int n=a+12;
			while(a<=n){
				if(a%2!=0){
					System.out.println(a);
				}
				a++;
			}
		}
        
	}
