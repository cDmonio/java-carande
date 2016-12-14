import java.util.Scanner;

class concatenarCadenas {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str1, str2, strFinal="";
    int longMayor;

    //Introducir str1 y str2
    System.out.print("Introduce la primera string: ");str1 = scanner.nextLine();
    System.out.print("Introduce la segunda string: ");str2 = scanner.nextLine();

    //Mirar cual es la string de mayor longitud y guardar ese numero en longMayor
    if (str1.length()>str2.length()) {longMayor = str1.length();}
    else {longMayor = str2.length();}

    //Iterar de 0 a longMayor-1 para concatenar cada caracter en strFinal,
    //solo si 'i' es menor que la longitud de la string que queremos concatenar
    for (int i=0;i<longMayor;i++) {
      if (i<str1.length()) {strFinal+=str1.charAt(i);}
      if (i<str2.length()) {strFinal+=str2.charAt(i);}
    }

    System.out.println("\nString concatenada: "+strFinal);
  }
}
