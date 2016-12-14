import java.util.Scanner;

public class cuentacorriente {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Opciones:\n\n1. Crear cuenta\n2. Cuenta corriente\n3. Cuenta de ahorro\n");
  System.out.print("Introduce una opcion: ");
  int opc = scanner.nextInt();
  String opcion = "";

  switch (opc) {
    case 1: System.out.print("\nIntroduce cantidad: "); int a = scanner.nextInt(); break;
    case 2:
    case 3: System.out.println("\nOpciones:\n\n1. Abonar\n2. Cargar \n3. Mostrar saldo\n");
            System.out.print("Introduce una opcion: ");
            opc = scanner.nextInt();
            switch (opc) {
              case 1: opcion = "abonar"; break;
              case 2: opcion = "cargar"; break;
              case 3: opcion = "mostrar saldo"; break;
              default: System.out.println("Opcion no valida");
            }
            if (opcion!="") System.out.println("Has introducido la opcion "+opcion);
  }

  }


}
