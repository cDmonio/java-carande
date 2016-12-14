import java.util.Scanner;

class menu {

  public static void main(String[] args) {
    menu();
    int op = introducir();

  }

  public static void menu() {
    System.out.println("\n\t\033[4mMenu\033[0m\n");
    System.out.println("  1. Entrar cadena");
    System.out.println("  2. Visualizar cadena");
    System.out.println("  3. Visualizar valores numericos");
    System.out.println("  4. Salir\n");

  }

  public static int introducir() {
    System.out.print("Introduce una opcion: ");
    Scanner scanner = new Scanner(System.in);
    int op = scanner.nextInt();
    if (!(op>0&&op<5)) {introducir();}
    return op;

  }

  public static void opcion(int op) {


  }

}
