import java.util.Scanner;

class Stack {
    public static Node firstNode;

    public static void main(String[] args) {
        for (int i=0 ; i<5 ; i++) {
            firstNode = createNode();
        }
        printStack();

        deleteNode(searchNode("testa"));

        printStack();

    }

    public static Node createNode() {
        if (firstNode == null) {
            Node node = new Node("testa");
            return node;
        } else {
            Node node = new Node("test", firstNode);
            return node;
        }
    }

    public static void printStack() {
        Node node = firstNode;
        System.out.format("\n    %-16s %-8s %s\n", "Self:", "Info:", "Next:");
        while (node!=null) {
            node.info();
            node = node.next;
        }
        System.out.println();
    }

    public static Node searchNode(String s) {
        Node node = firstNode;
        while (node!=null) {
            if (node.info == s) {
                return node;
            }
            node = node.next;
        }
        System.err.println("\nNodo no encontrado");
        return null;
    }

    public static void deleteNode(Node d) {
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
    // Falta insertar, busqueda y borrar

    // Para implementar la insercion necesito primero saber el nodo
    // anterior a la posicion deseada con busqueda

    // Para borrar un nodo necesito saber si es el final, si no lo es simplemente
    // necesito borrar y modificar el puntero del anterior al posterior
    // del que borro
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
        System.out.format("    %-16s %-8s %s", this, info, next);
    }
}
