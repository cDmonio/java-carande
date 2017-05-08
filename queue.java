import java.util.Scanner;

class QueueX2 {
    public static NodeX2 head;

    public static void main(String[] args) {
        NodeX2 a = createNode();
        NodeX2 b = createNode();
        NodeX2 c = createNode();
        // NodeX2 d = createNode();
        // NodeX2 e = createNode();

        System.out.println();
        System.out.format("%9s %24s %21s", "Prev:", "Nodo:", "Next:");
        System.out.println();
        a.info();
        b.info();
        c.info();
        // d.info();
        // e.info();
        System.out.println();

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
