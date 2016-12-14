import java.util.Scanner;

public class ejercicioclase2_String {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una palabra: ");
    String pal = scanner.nextLine();
    char a, b, c;
    a = pal.charAt(0);
    b = pal.charAt(1);
    c = pal.charAt(2);

    String pal2 = "" + a + b + c;
    pal2 = pal2.toLowerCase();

    /*
    1 aries
    2 tauro
    3 geminis
    4 cancer
    5 leo
    6 virgo
    7 libra
    8 escorpion
    9 sagitario
    10 caprio
    11 aquario
    12 piscis
    */

    if (pal2.equals("ari") || pal2.equals("leo") || pal2.equals("sag")) {
      System.out.println("\nFuego");

    }else if (pal2.equals("tau") || pal2.equals("vir") || pal2.equals("cap")) {
      System.out.println("\nTierra");

    }else if (pal2.equals("gem") || pal2.equals("lib") || pal2.equals("aqu")) {
      System.out.println("\nAire");

    }else if (pal2.equals("can") || pal2.equals("esc") || pal2.equals("pis")) {
      System.out.println("\nAgua");

    }else {
      System.out.println("\nPalabra no valida");

    }

  }
}
