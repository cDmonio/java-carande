import java.util.Scanner;

class metodos {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] ARGUMENTOS) {
    int num1,num2,OP_suma,OP_resta,OP_multi;
    float OP_div;
    num1 = LEER_NUMERO();
    num2 = LEER_NUMERO();
    OP_suma = SUMA(num1,num2);
    OP_resta = RESTA(num1,num2);
    OP_multi = MULTI(num1,num2);
    OP_div = DIV(num1,num2);
    VER_RESULTADOS(OP_suma,OP_resta,OP_multi,OP_div);

  }

  private static int LEER_NUMERO() {
    System.out.print("Introduce un numero: ");
    boolean a = true;
    return scanner.nextInt();

  }

  public static int SUMA(int a, int b) {
    return a + b;
  }

  public static int RESTA(int a, int b) {
    return a - b;
  }

  public static int MULTI(int a, int b) {
    return a * b;
  }

  public static float DIV(int a, int b) {
    return a / b;
  }

  public static void VER_RESULTADOS(int sum, int res, int mul, float div) {
    System.out.println("\n\tRESULTADOS:\n\n  Suma: "+sum+"\n  Resta: "+res+"\n  Multiplicacion: "+mul+"\n  Division: "+div+"\n");
  }

}
