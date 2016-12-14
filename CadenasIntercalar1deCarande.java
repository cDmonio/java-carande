/*
 Hacer un programa que al recibir como datos dos cadenas de caracteres
 forme una tercera cadena intercalando los caracteres de las palabras.
 */

import java.util.Scanner;

public class CadenasIntercalar1 {

  public static void main (String[] args){

  int i=0, j=0, k=0, longMayor;
  String cadena1="", cadena2="", cadena3="";

  Scanner in = new Scanner(System.in);

  System.out.print("\n Da Cadena1: ");
  cadena1 = in.nextLine();
  System.out.print("\n Da Cadena2: ");
  cadena2 = in.nextLine();

  if (cadena1.length()>cadena2.length()){ longMayor=cadena1.length();}
  else{longMayor=cadena2.length();}


  for(i=0;i<longMayor;i++){
    if (i<cadena1.length()) {cadena3+=cadena1.charAt(i);}
    System.out.println("i="+i);
    for(j=k;j<cadena2.length();j++){
      cadena3+=cadena2.charAt(j);
      System.out.println("j="+j+" k="+k);
      j=cadena2.length();
      k++;

    }
  }
	/*
	Esto es una chapuza de carande
	*/

  System.out.println("\n\n La cadena intercalada es: "+cadena3);

  System.out.print("\n Pulsa ENTER per terminar... ");
  in.nextLine();
  }
}
