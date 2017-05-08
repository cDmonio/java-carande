import java.util.Scanner;

class QueueX2 {
    public static NodeX2 head;

    public static void main(String[] args) {

        NodeX2 a = createNode();
        NodeX2 b = createNode();
        NodeX2 c = createNode();
        printQueue();


        deleteNode(b);
        //deleteNode(a);
        // deleteNode(b);



        printQueue();

    }

    public static NodeX2 createNode() {
        // System.out.print("\n    Info para el nodo: ");
        // String info = introducir();
        if (head == null) {
            head = new NodeX2("head");
            head.prev = head;
            head.next = head;
            return head;
        } else {
            NodeX2 node = new NodeX2("node", head.prev, head);
            head.prev.next = node;
            head.prev = node;
            return node;
        }
    }

    public static void printQueue() {
        NodeX2 node = head;
        System.out.format("\n%9s %25s %20s", "Prev:", "Nodo:", "Next:\n");
        do {
            if (node!=null) {
                node.info();
                node = node.next;
            }
        } while (node!=head);
        System.out.println();
    }

    public static void deleteNode(NodeX2 node) {
        if (node == head) {
            if (head==node.next) {
                head = null;
            } else {
                head = node.next;
            }
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

class NodeX2 {
    String info;
    NodeX2 prev, next;

    public NodeX2(String info) {
        this.info = info;
    }

    public NodeX2(String info, NodeX2 prev, NodeX2 next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

    public void info() {
        System.out.println();
        System.out.format("%s %9s - %s %18s", prev, info, this, next);
        // System.out.println("\n                                 A");
        // System.out.println("                                 |");
        // System.out.print("                                 V");
        // System.out.println("    "+prev+" - "+info+" - "+this);
    }
}
