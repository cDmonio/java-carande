import java.util.Scanner;

public class primos {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int a = scanner.nextInt();

    for (int i=2;i<a;i++) {   //proporciona numeros de 2 a N
      boolean primo = true;
      System.out.println("i: "+i);
      for (int j=2;j<i;j++) {   //proporciona numeros de 2 a i. Ejemplo:
        if (i%j==0 && primo) { //Si i=5, j va a variar de 2 a 4
          System.out.println("\tj: "+j);
          primo = false;        //5 se divide por 2, 3 y 4, si
        }                       //una de las divisiones es exacta primo=false
      }                         //si ninguna de las divisiones da exacta primo=true
      if (primo) {
      //System.out.println(i);
      }
    }

  }

}
