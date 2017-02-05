import java.util.Scanner;
import java.util.Arrays;

class arrayBi {

    public static void main(String[] args) {
        crearArray();



    }

    public static int[][] crearArray() {
      Scanner scanner = new Scanner(System.in);

      try {
          System.out.print("Introduce el numero alumnos: ");
          int alumnos = scanner.nextInt();
          System.out.print("Introduce el numero de notas por alumno: ");
          int notas = scanner.nextInt();

          int[][] arrayClase = new int[alumnos][notas+1];
          System.out.println(arrayClase.length+" "+arrayClase[0].length);
          System.out.println(Arrays.deepToString(arrayClase));
          return arrayClase;

      } catch (java.util.InputMismatchException e) { return crearArray(); }

    }
}
