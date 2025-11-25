package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> strList = new MyArrayListV4<>();

        strList.add("a");
        strList.add("b");
        strList.add("c");
        String s = strList.get(0);
        System.out.println("s = " + s);

        // 숫자
        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer i = intList.get(1);

        System.out.println("i = " + i);
    }
}
