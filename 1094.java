import java.util.Scanner;
public class Main {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
      int a,b,i=1,c=0,r=0,s=0,t=0;
      String ch="";
      double d=0,e=0,f=0;
	  a=ab.nextInt();
      while(i<=a){
    	  b=ab.nextInt();
    	  ch=ab.next();
          t+=b;
    	  if(ch.equals("C")){
    		  c+=b;
    	  }
    	  else if(ch.equals("R")){
    		  r+=b;
    	  }
    	  else if(ch.equals("S")){
    		  s+=b;
    	  }
    	  i++;
    	  
      }
      d=(((double)c/(double)t)*100);
      e=(((double)r/(double)t)*100);
      f=(((double)s/(double)t)*100);
      System.out.println("Total: "+t+" cobaias");
      System.out.println("Total de coelhos: "+c);
      System.out.println("Total de ratos: "+r);
      System.out.println("Total de sapos: "+s);
      System.out.println("Percentual de coelhos: "+String.format("%.2f",d)+" %");
      System.out.println("Percentual de ratos: "+String.format("%.2f",e)+" %");
      System.out.println("Percentual de sapos: "+String.format("%.2f",f)+" %");
	}
}
