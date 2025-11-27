package collection.link;

/**
 * 노드와 연결 링크 구조라고 하는데,
 * 링크 개념을 머릿속에 그릴 수 있어야 다음으로 진행이 가능하다.
 * 연결리스트 이런것도 이 개념을 사용을 하는거기 때문에 이걸 잉해를 해야 한다.
 * 여기 파트를 극복을 하면 연결리스트, 트리구조, 그래프 수 많은 자료구조를 이해를 하고 구현을 할 수 있다.
 * 화이팅
 * */
public class NodeMain1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("first = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);
        System.out.println();
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            System.out.println(x); // 참조값이 a,b,c가 다 다름. 이게 중요함. 같은 주소를 바라보는게 아님.
            x = x.next;
        }
    }
}
