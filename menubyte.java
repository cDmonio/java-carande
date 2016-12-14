import java.util.Scanner;

public class menubyte {

  public static void main(String[] args) {
    byte op = 1;
    Scanner scanner = new Scanner(System.in);
    String opcion = "";

    while (op!=0) {
      System.out.println("Menu:\n\n0.Salir\n1.Entrar\n2.Listar\n3.Busqueda\n");
      System.out.print("Introduce una opcion: ");
      boolean a = scanner.hasNextByte();
    if (a) {
      op = scanner.nextByte();
      if (op==0){opcion="Salir";}
      else if (op==1){opcion="Entrar";}
      else if (op==2){opcion="Listar";}
      else if (op==3){opcion="Busqueda";}
      else {System.out.println("\nOperador no valido\n\n");}

    }else {System.out.println("\nNo has escogido una opcion valida\n\n");op=0;}

      scanner.nextLine();
      if (op>0 && op<4) {System.out.println("\nHa elegido la opcion "+opcion+"\n\n");}

    }

  }
}
