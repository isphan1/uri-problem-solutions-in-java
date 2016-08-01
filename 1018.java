import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		int mon, o,f,t,te,fi,to,on;
		mon = sc.nextInt();
		o=mon/100;
		f=(mon-(o*100))/50;
		t=(mon-((o*100)+(f*50)))/20;
		te=(mon-((o*100)+(f*50)+(t*20)))/10;
		fi=(mon-((o*100)+(f*50)+(t*20)+(te*10)))/5;
		to=(mon-((o*100)+(f*50)+(t*20)+(te*10)+(fi*5)))/2;
		on=(mon-((o*100)+(f*50)+(t*20)+(te*10)+(fi*5)+(to*2)))/1;
		System.out.println(mon);
		System.out.println(o+" nota(s) de R$ 100,00");
		System.out.println(f+" nota(s) de R$ 50,00");
		System.out.println(t+" nota(s) de R$ 20,00");
		System.out.println(te+" nota(s) de R$ 10,00");
		System.out.println(fi+" nota(s) de R$ 5,00");
		System.out.println(to+" nota(s) de R$ 2,00");
		System.out.println(on+" nota(s) de R$ 1,00");

	}
}
