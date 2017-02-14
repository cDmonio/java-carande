import java.util.Scanner;
import java.util.Arrays;

class arrayBi {

    public static void main(String[] args) {
        int op;
        double[][] array = fillArray(createArray());

        do {
            menu();
            op = introducirOp();
            switch (op) {
                case 1: array = fillArray(createArray()); break;
                case 2: System.out.println("Array:\n"+Arrays.deepToString(array)); break;
                case 3: insertionSort(array); break;
                case 4: shellSort(array); break;
                case 5: bubbleSort(array); break;
                case 6: binarySearch(array); break;
                default: System.out.println("Opcion no valida"); break;
            }
        } while (op!=7);
    }

    public static void menu() {
        System.out.println("\n\t\033[4mMenu\033[0m\n");
        System.out.println("    1. Crear Array");
        System.out.println("    2. Mostrar Array");
        System.out.println("    Ordenar:");
        System.out.println("        3. Insertion Sort");
        System.out.println("        4. Shell Sort");
        System.out.println("        5. Bubble Sort");
        System.out.println("    6. Busqueda binaria");
        System.out.println("    7. Salir\n");
    }

    public static int introducirOp() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce una opcion: ");
            return scanner.nextInt();

        } catch (java.util.InputMismatchException e) { return introducirOp(); }
    }

    public static double[][] createArray() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el numero alumnos: ");
            int alumnos = scanner.nextInt();
            System.out.print("Introduce el numero de notas por alumno: ");
            int notas = scanner.nextInt();

            double[][] array = new double[alumnos][notas+1];
            return array;

        } catch (java.util.InputMismatchException e) { return createArray(); }
    }

    public static double[][] fillArray(double[][] array) {
        double total = 0;

        for (int a = 0 ; a < array.length ; a++) {
            for (int n = 0 ; n < array[a].length-1 ; n++) {
                array[a][n] = (int) (Math.random() * 1001) / 100.0;
                total += array[a][n];
            }
            //calcular la media y asignarlo a la ultima posicion del array anidado
            array[a][array[a].length-1] = Math.round(total/(array[a].length-1)*100)/100.0;
            total = 0;
        }
        return array;
    }

    public static void sort(double[][] array) {
        Arrays.sort(array, (a, b) -> Double.compare(a[a.length-1], b[b.length-1]));
    }

    public static void insertionSort(double[][] array) {
        int y = array[0].length-1; // ultima posicion de cada array (media)
        double[] temp;

        for (int x = 0 ; x<array.length-1 ; x++ ) { // mira por cada array[]
            while (array[x][y] > array[x+1][y]) {   // mira la ultima posicion de cada array
                temp = array[x];
                array[x] = array[x+1];
                array[x+1] = temp;
                x = 0;
            }
        }
    }

    public static void shellSort(double[][] array) {
        int y = array[0].length-1;
        double[] temp;
        int gap = array.length/2;

        while (gap > 1) {
            for (int x = 0 ; x<array.length-gap ; x++ ) {
                if (array[x][y] > array[x+gap][y]) {
                    temp = array[x];
                    array[x] = array[x+gap];
                    array[x+gap] = temp;
                }
            }
            gap = gap/2;
        }
        if (gap == 1) insertionSort(array);
    }

    public static void bubbleSort(double[][] array) {
        int y = array[0].length-1;
        double[] temp;
        int n = array.length;

        while (n>1) {
            for (int x = 0 ; x<n-1 ; x++) {
                if (array[x][y] > array[x+1][y]) {
                    temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
            n--;
        }
    }

    public static void binarySearch(double[][] array) {
        Scanner scanner = new Scanner(System.in);
        int y = array[0].length - 1;
        int l = 0;
        int r = array.length-1;

        System.out.print("\nIntroduce la nota media a buscar: ");
        double n = scanner.nextDouble();

        while (!(l>r)) {
            int m = (l+r) / 2;
            if (array[m][y] > n) r = m - 1;
            else if (array[m][y] < n) l = m + 1;
            else if (array[m][y] == n) {
                System.out.println("Array["+m+"] con nota media "+n+": "+Arrays.toString(array[m]));
                break;
            }
            if (l>r) System.out.println("Busqueda fallida D:");
        }
    }

}
