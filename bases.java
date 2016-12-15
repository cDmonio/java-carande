import java.util.Scanner;

public class bases {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String resultado="", resultadoR="", charResto = "";
    int num=0, base=1, resto;
    boolean entero;

    do {

    System.out.print("Introduce un numero [2-400]: ");
    entero = scanner.hasNextInt();
    if (entero) num = scanner.nextInt(); //introducir numero
    scanner.nextLine(); //limpiar scanner
  } while (!(num>1&&num<401)||!entero);  //loopear mientras num no vale 2-400

    do {

    System.out.print("Introduce la base [2-16]: ");
    entero = scanner.hasNextInt();
    if (entero) base = scanner.nextInt(); //introducir base
    scanner.nextLine(); //limpiar scanner
  } while (!(base>1&&base<17)||!entero); //loopear mientras base no vale 2-16

  while (num>0) {
    resto = num%base;

    if (resto>9) {  //si el resto es mayor a 9 asignamos letras
      switch (resto) {
        case 10: charResto="A"; break;
        case 11: charResto="B"; break;
        case 12: charResto="C"; break;
        case 13: charResto="D"; break;
        case 14: charResto="E"; break;
        case 15: charResto="F"; break;
      }
      resultado = charResto+resultado; //guardar resto en forma de caracter

    }else{
      resultado = resto+resultado; //guardar resto
    }
    num = num/base; //guardar resultado division en num
  }

  /*for (int i=resultado.length()-1;i>=0;i--) { //resultado al reves
    resultadoR+=resultado.charAt(i);
  }*/

  System.out.println("Resultado: "+resultado);

/*
  ejemplo 16 a base 2:
  16/2 = 8 ; resto 0
  8/2 = 4 ; resto 0
  4/2 = 2 ; resto 0
  2/2 = 1 ; resto 0
  1/2 = 0 ; resto 1

respuesta 16 a base 2 = 10000
*/
  }
}
