import java.util.Scanner;

class Stack {

    public static void main(String[] args) {
        Node a = new Node("hola");
        Node b = new Node("que tal", a);

        System.out.println(a.info+"\n"+a.next);
        System.out.println();
        System.out.println(b.info+"\n"+b.next);

    }

    public static Node createNode() {
        return null;
    }
}

class Node {
    String info;
    Node next = null;

    public Node(String info) {
        this.info = info;
    }

    public Node(String info, Node next) {
        this.info = info;
        this.next = next;
    }

    public void info() {
        System.out.println("{"+info+"}");
    }

}
