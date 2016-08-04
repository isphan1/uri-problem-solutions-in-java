import java.util.Scanner;
public class Main {
	static Scanner ab = new Scanner(System.in);
	public static void main(String[] args) {
		int a=ab.nextInt();
		int x=0,y=0,help=0,j=1;
		while(j<=a){
			if(a==0){
				break;
			}
			x=ab.nextInt();
			y=ab.nextInt();
			
			if(x>y){
				help=x;
				x=y;
				y=help;
			}
			int sum=0;
			for (int i = x+1; i <y; i++) {
				if(i%2!=0){
					sum+=i;
				}
			}
			System.out.println(sum);

			j++;
		}		
	}
	}
