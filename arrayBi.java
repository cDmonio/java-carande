import java.util.Scanner;
import java.util.Arrays;

class arrayBi {

    public static void main(String[] args) {
        double[][] array = rellenarArray(crearArray());



    }

    public static double[][] crearArray() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el numero alumnos: ");
            int alumnos = scanner.nextInt();
            System.out.print("Introduce el numero de notas por alumno: ");
            int notas = scanner.nextInt();

            double[][] arrayClase = new double[alumnos][notas+1];
            // System.out.println(arrayClase.length+" "+arrayClase[0].length);
            // System.out.println(Arrays.deepToString(arrayClase));
            return arrayClase;

        } catch (java.util.InputMismatchException e) { return crearArray(); }

    }

    public static double[][] rellenarArray(double[][] array) {
        double total = 0;

        for (int a = 0 ; a < array.length ; a++) {
            // System.out.println(a);
            for (int n = 0 ; n < array[a].length-1 ; n++) {
                // System.out.println("\t"+n);
                array[a][n] = (int) (Math.random() * 1001) / 100.0;
                total += array[a][n];
            }
            //calcular la media y asignarlo a la ultima posicion del array anidado
            array[a][array[a].length-1] = Math.round(total/(array[a].length-1)*100)/100.0;
            total = 0;
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }



}
