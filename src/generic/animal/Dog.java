package generic.animal;

public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }

    /**
     * 오버라이드 단축키
     * control + o
     * */
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
