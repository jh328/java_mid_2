package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        /**
         * control + T 누른 후 Refactor This 나온다.
         * 6번 Inline Variable 입력을 하면
         * 합쳐진다.
         * Object object = objectBox.get(); 이때 마우스 커서는 object 변수에 있어야 한다.
         * Integer integer = (Integer) object;
         * */
        Integer integer = (Integer) integerBox.get();

       // Integer integer1 = (Integer) objectBox.get();

        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello generic");

        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        integerBox.set("잘못된 타입 전달");
        Integer errorBox = (Integer) integerBox.get();
        System.out.println("errorBox = " + errorBox);
    }
}
