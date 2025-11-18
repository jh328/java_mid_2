package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain4 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 200);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);
        Cat cat1 = hospital.printAndReturn(cat);
        System.out.println("cat1 = " + cat1);
    }
}
