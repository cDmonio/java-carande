import java.util.Scanner;

class Stack {
    public static Node firstNode;

    public static void main(String[] args) {

        int op;
        Scanner scan = new Scanner(System.in);

        do {
            menu();
            System.out.print("    Introduce opcion: ");
            op = scan.nextInt();
            switch (op) {
                case 1: firstNode = createNode(); break;
                case 2: printStack(); break;
                case 3: delSingleNode(); break;
                case 4: delMultipleNodes(); break;
            }

        } while (op!=5);
    }

    public static String introducir() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static Node createNode() {
        System.out.print("\n    Info para el nodo: ");
        String info = introducir();
        if (firstNode == null) {
            Node node = new Node(info);
            return node;
        } else {
            Node node = new Node(info, firstNode);
            return node;
        }
    }

    public static void menu() {
        System.out.println("\n\t\033[4mMenu\033[0m\n");
        System.out.println("    1. Crear nodo");
        System.out.println("    2. Mostrar stack");
        System.out.println("    3. Borrar nodo");
        System.out.println("    4. Borrar nodo(s)");
        System.out.println("    5. Salir\n");
    }

    public static void printStack() {
        Node node = firstNode;
        System.out.format("\n    %-16s %-10s %s\n", "Self:", "Info:", "Next:");
        while (node!=null) {
            node.info();
            node = node.next;
        }
        System.out.println();
    }

    public static void delete(Node d) {
        Node node = firstNode;
        while (node!=null) {
            if (firstNode == d) {
                firstNode = d.next;
            } else if (node.next == d) {
                node.next = d.next;
            }
            node = node.next;
        }
    }

    public static void delSingleNode() {
        Node node = firstNode;
        System.out.print("\n    Info del nodo a borrar: ");
        String s = introducir();
        while (node!=null) {
            if (node.info.equals(s)) {
                node.info();
                System.out.print(" ==> Eliminar este nodo? (y/n): ");
                if (introducir().equals("y")) {
                    delete(node);
                }
                node = null;
            } else {
                node = node.next;
            }
        }
    }

    public static void delMultipleNodes() {
        Node node = firstNode;
        System.out.print("\n    Info del nodo(s) a borrar: ");
        String s = introducir();
        while(node!=null) {
            if (node.info.equals(s)) {
                node.info();
                System.out.print(" ==> Eliminar este nodo? (y/n): ");
                if (introducir().equals("y")) {
                    delete(node);
                }
            }
            node = node.next;
        }
    }
}

class Node {
    String info;
    Node next;

    public Node(String info) {
        this.info = info;
    }

    public Node(String info, Node next) {
        this.info = info;
        this.next = next;
    }

    public void info() {
        System.out.println();
        System.out.format("    %-16s %-10s %s", this, info, next);
    }
}
