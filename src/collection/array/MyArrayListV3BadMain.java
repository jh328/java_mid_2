package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numList = new MyArrayListV3();

        numList.add(1);
        numList.add(2);
        numList.add("3");
        System.out.println(numList);
        Integer num1 = (Integer) numList.get(0);
        Integer num2 = (Integer) numList.get(1);

        /**
         * ClassCastException: class java.lang.String cannot be cast to class java.lang.
         * Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
         * at collection.array.MyArrayListV3BadMain.main
         * */
        Integer num3 = (Integer) numList.get(2);
    }
}
