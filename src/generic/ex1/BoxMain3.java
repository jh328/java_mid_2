package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();

        integerGenericBox.set(10);
        Integer i = integerGenericBox.get();
        System.out.println("i = " + i);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("Hello Generic");
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(1.30);
        Double v = doubleGenericBox.get();
        System.out.println("v = " + v);
    }
}
