import java.util.Scanner;

public class ejercicioclase2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un numero: ");
    int n = scanner.nextInt();

    if (n==1 || n==5 || n==9){
      System.out.println("\nFuego");

    }else if(n==2 || n==6 || n==10){
      System.out.println("\nTierra");

    }else if (n==3 || n==7 || n==11) {
      System.out.println("\nAire");

    }else if (n==4 || n==8 || n==12) {
      System.out.println("\nAgua");

    }else {
	  System.out.println("\nOperador no valido");
	
	}
    
  }

}
