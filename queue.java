import java.util.Scanner;

class Queue2 {
    public static Node2 head;

    public static void main(String[] args) {

    }

    public static void createNode() {
        // System.out.print("\n    Info para el nodo: ");
        // String info = introducir();
        Node2 node = new Node2("test");
        if (head == null) {

        }
    }


}

class Node2 {
    String info;
    Node2 prev, next;

    public Node2(String info) {
        this.info = info;
    }

    public Node2(String info, Node2 prev, Node2 next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

}
