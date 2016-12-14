import java.util.Scanner;

class string {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una cadena: ");
    String string = scanner.nextLine();
    int vocales=0, numeros=0, resto=0;

    for (int i=0;i<string.length();i++) {
      char a = string.charAt(i);
      String b = ""+a;

      switch (b) {case "a": case "e": case "i": case "o": case "u": vocales++;break;}

      if (Character.isDigit(string.charAt(i))) {numeros++;}

      resto = string.length()-(vocales+numeros);
  }

  System.out.println("Vocales: "+vocales);
  System.out.println("Numeros: "+numeros);
  System.out.println("Resto: "+resto);

}
}
