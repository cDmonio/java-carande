import java.util.Scanner;

class Stack {
    public static Node firstNode;

    public static void main(String[] args) {
        for (int i=0 ; i<4 ; i++) {
            firstNode = createNode();
            firstNode.info();
        }
    }

    public static Node createNode() {
        if (firstNode == null) {
            Node node = new Node("test");
            return node;
        } else {
            Node node = new Node("test", firstNode);
            return node;
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
        System.out.format("%-8s %-16s %s\n", "Info:", "Self:", "Next:");
        System.out.format("%-8s %-16s %s\n", info, this, next);
    }

}
