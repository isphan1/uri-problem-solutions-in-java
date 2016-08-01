import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
int a=ab.nextInt();
int b=ab.nextInt();
if(a>=b){
	System.out.println("O JOGO DUROU "+((24-a)+b)+" HORA(S)");
}
else if(b>a){
	System.out.println("O JOGO DUROU "+(b-a)+" HORA(S)");
}
	}
}
