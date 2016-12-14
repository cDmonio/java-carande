/*
inicio --> entrar a,b,c --> disc = bb-4ac
si disc<0 --> no solucion
else      --> si a = 0 --> no 2 grado, sol -c/b
              else     -->  sol1 = (-b+sqr(disc))/2a
                            sol2 = (-b-sqr(disc))/2a
*/
import java.util.Scanner;
import java.lang.Math;

public class ecuacion {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double a, b, c, disc, sol1, sol2;

    //introducir a b y c
    System.out.print("Introduce a: ");
    a = scanner.nextInt();
    System.out.print("Introduce b: ");
    b = scanner.nextInt();
    System.out.print("Introduce c: ");
    c = scanner.nextInt();

    //empezar temporizador
    double startTime = System.nanoTime();

    //calcular discriminante de la ecuacion
    disc = (b*b)-(4*a*c);

    if (b==0 && c==0){//ecuacion segundo grado incompleta, b = 0 y c = 0
      sol1=0;
      System.out.println("\nLa ecuacion "+a+"x^2 = 0 tiene como solucion:\nx = "+sol1);

    }else if (a==0 && c==0) {//ecuacion segundo grado incompleta, a = 0 y c = 0
      sol1=-b;
      System.out.println("\nLa ecuacion "+b+"x = 0 tiene como solucion:\nx = "+sol1);

    }else if(disc<0) { //si el discriminante es negativo
      System.out.println("\nLa equacion no tiene solucion");

    }else if (a==0){//ecuacion primer grado, a = 0
      sol1 = -c/b;
      System.out.println("\nLa ecuacion "+b+"x "+c+" = 0 tiene como solucion:\nx = "+sol1);

    }else if (b==0){//ecuacion segundo grado incompleta, b = 0
      sol1 = Math.sqrt(-c/a);
      System.out.println("\nLa ecuacion "+a+"x^2 "+c+" = 0 tiene como solucion:\nx = "+sol1);

    }else if (c==0){//ecuacion segundo grado incompleta, c = 0
      sol1 =-b/a;
      System.out.println("\nLa ecuacion "+a+"x^2 "+b+"x = 0 tiene como solucion:\nx = "+sol1);

    }else{//ecuacion segundo grado completa
      sol1 = (-b+Math.sqrt(disc))/(2*a);
      sol2 = (-b-Math.sqrt(disc))/(2*a);
      System.out.println("\nLa ecuacion "+a+"x^2 "+b+"x "+c+" = 0 tiene como soluciones:");
      System.out.println("x1 = "+sol1+"\nx2 = "+sol2);

    }
    //acabar temporizador
    double endTime = System.nanoTime();
    double duration = (endTime - startTime)/1000000000;
    System.out.println("\n\nTiempo de ejecucion: "+duration+" s");
  }
}
