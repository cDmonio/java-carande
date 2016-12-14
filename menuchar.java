import java.util.Scanner;

public class menuchar {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String opcion = "";
    String palabra="esda";
    char op = palabra.charAt(0);

    while (Character.isLetter(op)) {
      System.out.println("Menu:\n\n0.Salir\n1.Entrar\n2.Listar\n3.Busqueda\n");
      System.out.print("Introduce una opcion: ");
      palabra = scanner.nextLine();
      op = palabra.charAt(0);
    /*  if (op=="s"){opcion="Salir";}
      else if (op=="e"){opcion="Entrar";}
      else if (op=="l"){opcion="Listar";}
      else if (op=="b"){opcion="Busqueda";}
      else {System.out.println("\nOperador no valido\n\n");}*/

    }
    System.out.println("\nHa elegido la opcion "+opcion+"\n\n");
  }
}
