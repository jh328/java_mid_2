package collection.link;

import static java.awt.AWTEventMulticaster.add;

public class NodeMain4 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first);

        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 값 조회
        int idx = 1;
        Node node = getNode(first, idx);
        System.out.println("node = " + node);

        // 값 추가
        add(first, "D");
        System.out.println(first);
    }



    private static Node getNode(Node node, int idx) {
        Node x = node;
        for (int i = 0; i < idx; i++) {
            x = x.next;
        }
        return x;
    }


    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node last) {
        Node x = last;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String d) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(d);

    }
}
