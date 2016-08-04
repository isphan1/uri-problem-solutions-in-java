import java.util.Scanner;
public class Main {
	static Scanner ab = new Scanner(System.in);
	public static void main(String[] args) {
		int a=ab.nextInt();
		int b=ab.nextInt();
		int sum=0;
		if(a+1==b){
			sum=0;			
		}
		else if(b+1==a){
			sum=0;			
		}
		else if(a==b){
			sum=0;
		}
		else if(a>b){
			if(b>0){
			while(b<a){
				if(b%2!=0){
					sum+=b;
				}
				b++;
			}
	}
			else if (b<0){
				b+=1;
				while(b<a){
					if(b%2!=0){
						sum+=b;
					}
					b++;
				}	
			}
		}
		else if(b>a&&a%2!=0){
			a=a+1;
			while(a<b){
				if(a%2!=0){
					sum+=a;
				}
				a++;
			}

	}
		System.out.println(sum);

        }
	}
