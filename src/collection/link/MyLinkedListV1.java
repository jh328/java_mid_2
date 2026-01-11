package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (newNode == null) {
            first = newNode;
        }else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x != null) {
            x = x.next;
        }
        return x;
    }
}
