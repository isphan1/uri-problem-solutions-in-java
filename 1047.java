import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
int a=ab.nextInt();
int b=ab.nextInt();
int c=ab.nextInt();
int d=ab.nextInt();
if(((a*60)+b)>=((c*60)+d)){
 	
int e=((24*60)-((a*60)+b))+((c*60)+d);

	System.out.println("O JOGO DUROU "+(e/60)+" HORA(S) E "+(e%=60)+" MINUTO(S)");
}
else{
	int e=((c*60)+d)-((a*60)+b);
	System.out.println("O JOGO DUROU "+(e/60)+" HORA(S) E "+(e%=60)+" MINUTO(S)");
}
	}
}
