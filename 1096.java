import java.util.Scanner;
public class Main {
	static Scanner ab = new Scanner(System.in);
	public static void main(String[] args) {
int i,j=1,k=4;
while(j<10){
		for(i=3;i>0;i--){
	System.out.println("I="+j+" "+"J="+(k+i));
}j+=2;
}
	}
}
