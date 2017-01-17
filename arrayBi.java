import java.util.Scanner;

class arrayBi {

    public static void main(String[] args) {
        int[] xy = introducir();
        System.out.println(xy[0]+" "+xy[1]);
    }

    public static int[] introducir() { // introducir longitud array y lo devuelve
      Scanner scanner = new Scanner(System.in);

      try { // controla InputMismatchException con un try, catch
        System.out.print("Introduce numero alumnos y numero de notas: ");
        int[] xy = {scanner.nextInt(), scanner.nextInt()};
        return xy;

      } catch (java.util.InputMismatchException e) { return introducir(); }

    }
}
