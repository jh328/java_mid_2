package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 300);

        AnimalMethod.<Dog>checkUp(dog); // 타입 명시

        System.out.println();

        AnimalMethod.checkUp(cat); // 타입 추론

        Dog target = new Dog("큰 개", 500);
        Dog bigger = AnimalMethod.bigger(dog, target);
        System.out.println("bigger = " + bigger);
    }
}
