import java.util.Scanner;

class cadena2 {

  public static void main(String[] args) {

    String abc = "abcdefghijklmnopqrstuvwxyz";
    String ABC09 = abc.toUpperCase()+"0123456789";
    abc+=ABC09;
    String resultado="";
    int strInicio, strFinal;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce una string: ");
    String palabra = scanner.nextLine()+" ";


    //if (abc.indexOf(palabra.charAt(0))!=-1) {contador=1;}

    for (int i=0;i<palabra.length();i++) {
      char a = palabra.charAt(i);
      char b = ' ';
      if (i+1<palabra.length()) {b = palabra.charAt(i+1);}

      if (abc.indexOf(a)!=-1) { //encontrar principio
        strInicio=palabra.indexOf(palabra.charAt(b));
        System.out.print(strInicio);
      }
      if ( abc.indexOf(a)!=-1 && b == ' ') {  //encontar final
        strFinal=palabra.indexOf(palabra.charAt(a));
        System.out.print(strFinal);
      }
    }

    System.out.println("");
  }
}
