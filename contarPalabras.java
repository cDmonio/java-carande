import java.util.Scanner;

class contarPalabras {

  public static void main(String[] args) {
    int contador = 0;
    String abc = "abcdefghijklmnopqrstuvwxyz";
    String ABC09 = abc.toUpperCase()+"0123456789";
    abc+=ABC09;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una string: ");
    String palabra = scanner.nextLine();

    if (abc.indexOf(palabra.charAt(0))!=-1) {contador=1;}

    for (int i=0;i<palabra.length();i++) {
      char a = palabra.charAt(i);
      char b = ' ';
      if (i+1<palabra.length()) {b = palabra.charAt(i+1);}
      if (a == ' ' && abc.indexOf(b)!=-1) {contador++;}
    }

    System.out.println("Tu string tiene "+contador+" palabras");

  }
}
