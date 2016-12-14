import java.util.Scanner;

public class prueba {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un numero etre 0 y 9999: ");
    int a = scanner.nextInt();

    if ((a/10)==0) {
      System.out.println("1 cifra");
    }else if ((a/100)==0) {
      System.out.println("2 cifras");
    }else if ((a/1000)==0) {
      System.out.println("3 cifras");
    }else if ((a/10000)==0) {
      System.out.println("4 cifras");
    }else{
      System.out.println("Error");
    }

  }
}
