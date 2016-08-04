import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int a=100;
		int num[]=new int [a];
		int big,pos=0;
		big=0;
for (int k = 0; k <a; k++) {
	int b=ab.nextInt();
	num[k]=b;
}
for (int i = 0; i < a; i++) 
{
    if(num[i]>big) 
    {
        big=num[i];
        pos=i;
    }
 
}
System.out.println(big);
System.out.println(pos+1);
	}
}
