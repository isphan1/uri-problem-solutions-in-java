import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int day,y,m,d;
		day=sc.nextInt();
		y=day/365;
		m=(day-(y*365))/30;
		d=(day-((y*365)+(m*30)));
		System.out.println(y+" ano(s)");
		System.out.println(m+" mes(es)");
		System.out.println(d+" dia(s)");
	}
}
