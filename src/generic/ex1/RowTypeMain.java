package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        Object object = integerBox.get();
        System.out.println("object = " + object);
    }
}
