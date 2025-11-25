package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(3, "e");
        System.out.println(list);

        list.add(0, "A");
        System.out.println(list);

        Object remove = list.remove(4);
        System.out.println(remove);
        System.out.println(list);

        Object remove1 = list.remove(0);
        System.out.println(remove1);
        System.out.println(list);
/*
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        list.add("f");
        System.out.println(list);
*/
    }
}
