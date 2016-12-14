//ejercicio para introducir 3 valores, compararlos de 1 en 1 y visualizarlos ordenadamente

import java.util.Scanner;

public  class ejercicio1 {

  public static void main(String[] args) {
    int a, b, c;
    Scanner scanner = new Scanner(System.in);
    
    //inicializar a 0 mayor, mediano y menor para evitar errores
    int mayor = 0;
    int mediano = 0;
    int menor = 0;

    //introducir valores a, b y c
    System.out.print("Introduce a: ");
    a = scanner.nextInt();
    System.out.print("Introduce b: ");
    b = scanner.nextInt();
    System.out.print("Introduce c: ");
    c = scanner.nextInt();

    //si c es el mayor
    if (a>b){
      if(a>c){
        mayor = a;
        if(b>c) {//si a es el mayor determinar mediano y menor entre b y c
          mediano = b;
          menor = c;
        }else{
          mediano = c;
          menor = b;
        }
      }
    }

    //si b es el mayor
    if (b>a){
      if(b>c){
        mayor = b;
        if(a>c) {//si b es el mayor determinar mediano y menor entre a y c
          mediano = a;
          menor = c;
        }else{
          mediano = c;
          menor = a;
        }
      }
    }

    //si c es el mayor
    if (c>a){
      if(c>b){
        mayor = c;
        if(a>b) {//si c es el mayor determinar mediano y menor entre a y b
          mediano = a;
          menor = b;
        }else{
          mediano = b;
          menor = a;
        }
      }
    }

    System.out.println("\nOrdenados de mayor a menor: "+mayor+" - "+mediano+" - "+menor);

  }

}
