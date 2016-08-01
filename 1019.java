import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int ti, h, m, s;
		ti = sc.nextInt();
		h = ti / 3600;
		m = (ti - (h * 3600)) / 60;
		s = ((ti - (h * 3600)) - (m * 60));
		System.out.println(h + ":" + m + ":" + s);
	}
}
