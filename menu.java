import java.util.Scanner;

class menu {

  static Scanner scanner = new Scanner(System.in); //declarar scanner
  static String str = "";  //declarar String 'str'

  public static void main(String[] args) {
    int op;

    do {
      menu(); //llamar funcion 'menu()'
      op = introducir();  //guardar opcion seleccionada en 'op'
      opcion(op); //pasar a la funcion 'opcion()' el valor de 'op'

    } while (op!=4); //repetir mientras 'op' sea diferente de 4

  }

  public static void menu() { //imprimir opciones de nuestro menu
    System.out.println("\n\t\033[4mMenu\033[0m\n");
    System.out.println("  1. Entrar cadena");
    System.out.println("  2. Visualizar cadena");
    System.out.println("  3. Visualizar numeros de la cadena");
    System.out.println("  4. Salir\n");

  }

  public static int introducir() {
    System.out.print("Introduce una opcion: ");
    int num = scanner.nextInt();
    scanner.nextLine(); //limpiar scanner
    if (!(num>0&&num<5)) {introducir();} //se llama a ella misma si 'num' no vale [1-4] (recursividad)
    return num; //devuelve la opcion seleccionada en la variable 'num'

  }

  public static void opcion(int op) {

    switch (op) {
      case 1: { //si 'op' vale 1, pedir string y guardar en 'str'
        System.out.print("Introduce una string: ");
        str = scanner.nextLine();
        break;
      }

      case 2: { //si 'op' vale 2, mostrar string 'str'
        System.out.println("Cadena: "+str);
        break;
      }

      case 3: { //si 'op' vale 3:
        String strNum = "";

        for (int i=0;i<str.length();i++) {  //iterar sobre cada caracter de 'str'
          if (Character.isDigit(str.charAt(i))) { //determinar si el caracter es un digito,
            strNum += str.charAt(i);  //si lo es, concatenar caracter en 'strNum'
          }
        }

        System.out.println("Numeros cadena: "+strNum);  //mostrar 'strNum'
        break;
      }

      case 4: { //si 'op' vale 4, mostrar mensaje de salida
        System.out.println("Bye!!");
        break;
      }

    }

  }

}
