import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class arrayBi {

    public static void main(String[] args) {
        double[][] array = fillArray(createArray());
        sort(array);


    }

    public static double[][] createArray() {
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

        } catch (java.util.InputMismatchException e) { return createArray(); }

    }

    public static double[][] fillArray(double[][] array) {
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

    public static void sort(double[][] array) {
        // Arrays.sort(array, new Comparator<double[]>() {
        //     public int compare(double[] a, double[] b) {
        //         return Double.compare(b[a.length-1], a[a.length-1]);
        //     }
        // });
        Arrays.sort(array, (a, b) -> Double.compare(b[b.length-1], a[a.length-1]));
        System.out.println(Arrays.deepToString(array));
    }

    // Quick sort
    public static void swap(int[] array, int left, int right) {
        int t = array[left];
        array[left] = array[right];
        array[right] = t;
    }

    public static void quicksort(int [] array) {
        quicksort(array, 0, array.length-1);
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) return;

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                 swap(array, left, right);
                 left++;
                 right--;
            }
        }
        return left;
    }
}
