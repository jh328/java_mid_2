package generic.test.test5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); 최소한 애니멀 보다는 위에 있어야 사용할 수 있음.

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    private static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍11", 200));
    }
}
