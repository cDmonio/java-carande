
import java.util.Scanner;

class arrayObjetos {
    public static void main(String[] args) {
        int op;
        int i = 0;
        Cliente[] array = new Cliente[10];

        do {
            menu();
            op = introducirOp();
            switch (op) {
                case 1: newCliente(array, i); if (i<10) i++; break;
                case 2: showCliente(array); break;
            }
        } while (op!=3);
    }

    public static void menu() {
        System.out.println("\n\t\033[4mMenu\033[0m\n");
        System.out.println("    1. Introducir Cliente");
        System.out.println("    2. Mostrar cliente");
        System.out.println("    3. Salir\n");
    }

    public static int introducirOp() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un numero: ");
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) { return introducirOp(); }
    }

    public static void newCliente(Cliente[] array, int i) {
        Scanner scan = new Scanner(System.in);
        String nombre, apellidos;
        int telefono, edad;

        System.out.println("\n\033[4mCliente #"+i+"\033[0m\n");
        System.out.print("Nombre: "); nombre = scan.nextLine();
        System.out.print("Apellidos: "); apellidos = scan.nextLine();
        System.out.print("Telefono: "); telefono = scan.nextInt();
        System.out.print("Edad: "); edad = scan.nextInt();

        array[i] = new Cliente(nombre, apellidos, telefono, edad);
    }

    public static void showCliente(Cliente[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIntroduce el numero del cliente: ");
        int a = 0;

        try {
            a = scan.nextInt();
            System.out.print("\n\033[4mCliente #"+a+"\033[0m\n");
            array[a].info();
        } catch (java.lang.NullPointerException e) {
            System.out.println("\nCliente #"+a+" no existe");
        }

    }

}

class Cliente {
    String nombre;
    String apellidos;
    int telefono;
    int edad;

    public Cliente(String nombre, String apellidos, int telefono, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void info() {
        System.out.println("\nNombre:   "+nombre);
        System.out.println("Apellido: "+apellidos);
        System.out.println("Telefono: "+telefono);
        System.out.println("Edad:     "+edad+"\n");
    }
}
