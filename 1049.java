import java.util.Scanner;

public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
       String a =ab.nextLine();
       String b =ab.nextLine();
       String c =ab.nextLine();

      if(a.toLowerCase().equals("vertebrado")){
    	if (b.toLowerCase().equals("ave")) {
			if (c.toLowerCase().equals("carnivoro")) {
				System.out.println("aguia");
			}
			else if (c.toLowerCase().equals("onivoro")) {
				System.out.println("pomba");
			}
		}

    	else if (b.toLowerCase().equals("mamifero")) {
			if (c.toLowerCase().equals("onivoro")) {
				System.out.println("homem");
			}
			else if (c.toLowerCase().equals("herbivoro")) {
				System.out.println("vaca");
			}
		}
    	
      }
