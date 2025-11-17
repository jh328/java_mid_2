package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox ib = new IntegerBox();
        ib.set(10);
        Integer i = ib.get();
        System.out.println("i = " + i);

        StringBox stringBox = new StringBox();
        stringBox.set("hello generic");
        String str = stringBox.get();
        System.out.println("str = " + str);


    }
}
