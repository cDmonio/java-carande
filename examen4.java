import java.util.Scanner;
import java.util.Arrays;

class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[30];
        String[] alumnos = new String[30];
        int i = 0;
        int op;

        do {
            System.out.println("1. Intoduce alumno");
            System.out.println("2. Mostrar arrays");
            System.out.println("3. Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1: entrada(notas, alumnos, i); i++; break;
                case 2: {
                    System.out.println(Arrays.toString(alumnos));
                    System.out.println(Arrays.toString(notas));
                    break;
                }
            }
        } while (op!=3);
    }

    public static void entrada(int[] notas, String[] alumnos, int i) {
        Scanner scanner = new Scanner(System.in);
        String tempS;
        int tempI;

        System.out.print("Introduce el nombre: ");
        tempS = scanner.nextLine();
        System.out.print("Introduce la nota: ");
        tempI = scanner.nextInt();

        alumnos[i] = tempS;
        notas[i] = tempI;
    }
}
