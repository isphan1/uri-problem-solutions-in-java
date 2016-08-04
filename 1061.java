import java.util.Scanner;
public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		int s1,s2,s3,s4,e1,e2,e3,e4,f1=0,f2=0,f3=0,f4=0;
		String d1,d2,c1,c2,c3,c4;
		d1=ab.next();
		s1=ab.nextInt();
		s2=ab.nextInt();
		c1=ab.next();
		s3=ab.nextInt();
		c2=ab.next();
		s4=ab.nextInt();
		d2=ab.next();
		e1=ab.nextInt();
		e2=ab.nextInt();
		c3=ab.next();
		e3=ab.nextInt();
		c4=ab.next();
		e4=ab.nextInt();
		
		int st=s1*86400+s2*3600+s3*60+s4;
		int et=e1*86400+e2*3600+e3*60+e4;
		if(et>st){
			 f1=(et-st)/86400;
			 f2=((et-st)%86400)/3600;
			 f3=(((et-st)%86400)%3600)/60;
			 f4=((((et-st)%86400)%3600)%60);
			 
				System.out.println(f1+" dia(s)");
				System.out.println(f2+" hora(s)");
				System.out.println(f3+" minuto(s)");
				System.out.println(f4+" segundo(s)");
		}
		else {
			f1=((86400-st)+et)/86400;
			f2=(((86400-st)+et)%86400)/3600;
			f3=((((86400-st)+et)%86400)%3600)/60;
			f4=(((((86400-st)+et)%86400)%3600)%60);
	
			System.out.println(f1+" dia(s)");
			System.out.println(f2+" hora(s)");
			System.out.println(f3+" minuto(s)");
			System.out.println(f4+" segundo(s)");
	}
		
	}
}
