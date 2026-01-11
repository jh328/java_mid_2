package set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); // 처음에는 값이 없기 때문에 반복을 안하기 때문에 O(1)이 되지만, 그 이후부터는 반복을 하기 때문에 O(n)이 된다. 데이터의 개수만큼 돌아야 한다.
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("result = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3)); // O(n)
        System.out.println("set.contains(99) = " + set.contains(99)); // O(n)
    }
}
