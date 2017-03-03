import java.util.Scanner;

class clases1 {
    public static void main(String[] args) {
        ParPrimo n = new ParPrimo(introducirN());
        int op;

        do {
            menu();
            op = introducirN();
            switch (op) {
                case 1: n.par(); break;
                case 2: n.primo(); break;
                case 3: n = new ParPrimo(introducirN()); break;
            }

        } while (op!=4);
    }

    public static void menu() {
        System.out.println("\n\t\033[4mMenu\033[0m\n");
        System.out.println("    1. Par");
        System.out.println("    2. Primo");
        System.out.println("    3. Dar numero");
        System.out.println("    4. Salir\n");
    }

    public static int introducirN() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un numero: ");
            return scanner.nextInt();

        } catch (java.util.InputMismatchException e) { return introducirN(); }
    }
}

class ParPrimo {
    public int n;

    public ParPrimo(int a) {
        n = a;
    }

    public void par() {
        if (n%2 == 0) System.out.println(n+" es par");
        else System.out.println(n+" no es par");
    }

    public void primo() {
        boolean primo = true;

        for (int i=n-1 ; i>1 ; i--) {
            System.out.println(n+" % "+i+" = "+n%i);
            if (n%i==0) primo = false;
        }

        if (primo) System.out.println(n+" es primo");
        else System.out.println(n+" no es primo");
    }
}
