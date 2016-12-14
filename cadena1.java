import java.util.Scanner;

class cadena1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String abc = "abcdefghijklmnopqrstuvwxyz";
    String azAZ09 = abc+abc.toUpperCase()+"0123456789";
    String resultado = "";

    System.out.print("Introduce una string: ");
    String palabra = scanner.nextLine();

    for (int i=0, j=palabra.length();i<azAZ09.length();i++) {

      if (azAZ09.indexOf(palabra.charAt(i))==-1) {
        resultado+=palabra.charAt(i);
      }
    }

    System.out.println(resultado);

  }

}
/* Ejemplo:
palabra = "hola"


*/
