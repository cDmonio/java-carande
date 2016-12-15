import java.util.Scanner;

class examen {

  public static void main(String[] args) {

    String cad = "101707123321", cad2="";
    int y = cad.length(), x = y-3;
    char a, b, c, mayor;

    do {
      cad2 = cad.substring(x, y);
      System.out.println("Cadena: "+cad2);

      a = cad2.charAt(0);
      b = cad2.charAt(1);
      c = cad2.charAt(2);

      if (a>b && a>c) mayor = a;
      else if (b>a && b>c) mayor = b;
      else mayor = c;

      System.out.println("Mayor: "+mayor+"\n");

      x -= 3; y -=3;

    } while (x>=0);

  }

}
