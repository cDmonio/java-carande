import java.util.Scanner;

public class diasenmes {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int dias=0;

    System.out.print("Introduce mes: ");
    int mes = scanner.nextInt();
    System.out.print("Introduce anyo: ");
    int anyo = scanner.nextInt();

    switch (mes) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12: dias = 30; break;
      case 4: case 6: case 9: case 11: dias = 31; break;
      case 2: dias = 28; if ((anyo%4==0) && (anyo%100!=0) || anyo%400==0) {dias = 29;} break;
    }

    System.out.println("Tiene "+dias+" dias");

  }

}
