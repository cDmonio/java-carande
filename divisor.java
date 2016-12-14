import java.util.Scanner;

public class divisor {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int n = scanner.nextInt();
    String divisores = "";
    boolean primo = true;     //primo inicializado en true

    for (int i=2;i<n;i++) {   //proporciona numeros de 2 a n
      if (n%i==0) {           //ejemplo: si n = 5, divide 5 entre 2, 3 y 4
        divisores+=i+" ";     //si se cumple alguna de las teraciones guarda
        primo = false;        //el divisor i por tanto primo = false
      }
    }

    System.out.println("Divisores: "+divisores);
    System.out.println("Primo: "+primo);
  }

}
