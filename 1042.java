import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);
	public static void main(String[] args) {
	 
		int a=ab.nextInt();
		int b=ab.nextInt();
		int c=ab.nextInt();
        int num[]=new int[3];
        num[0]=a;
        num[1]=b;
        num[2]=c;
        int temp;
       for (int i = 0; i < num.length; i++) {
    	   for (int j = 0; j < num.length; j++) {
        		if(num[i]<num[j]){
        			temp=num[j];
        			num[j]=num[i];
        			num[i]=temp;
        		}
    	   }
       }
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
