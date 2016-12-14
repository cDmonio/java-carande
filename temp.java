import java.util.Scanner;

public class temp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int diaMax=0, diaMin=0, mesMax=0, mesMin=0, op=1, aux1, aux2;
    double aux3, aux4, tempMax=0, tempMin=1000;

    while (op!=0) {
      System.out.println("Menu:\n\n0.Salir\n1.Entrar\n");
      System.out.print("Introduce una opcion: ");
      op = scanner.nextInt();
      System.out.println();

      if (op==1) {
        //guardar valores en variables auxiliares aux 1 2 3 y 4
        System.out.print("Introduce el dia: ");aux1=scanner.nextInt();
        System.out.print("Introduce el mes: ");aux2=scanner.nextInt();
        System.out.print("Introduce la temperatura maxima: ");aux3=scanner.nextDouble();
        System.out.print("Introduce la temperatura minima: ");aux4=scanner.nextDouble();
        System.out.println();

        //si la temperatura maxima y minima introducida es mayor o menor a tempMax
        //y tempMin respectivamente se guardan los valores de las variables aux a ellas
        if (aux3>tempMax) {diaMax=aux1;mesMax=aux2;tempMax=aux3;}
        if (aux4<tempMin) {diaMin=aux1;mesMin=aux2;tempMin=aux4;}

      }

    }
    //mostrar dia, mes con temp maxima y dia, mes con temp minima
    System.out.println("\033[4mDia\tMes\tTempMax\033[0m");
    System.out.println(diaMax+"\t"+mesMax+"\t"+tempMax+"\n");
    System.out.println("\033[4mDia\tMes\tTempMin\033[0m");
    System.out.println(diaMin+"\t"+mesMin+"\t"+tempMin+"\n");

  }
}
