package generic.test.ex3;

import generic.animal.Animal;
/**
 * 이번 챕터에서의 핵심은 <T extends Animal>이다.
 * 타입 매개변수 T를 Animal과 그 자식만 받을 수 있도록 제한을 하는거다.
 * 즉 T의 상한이 Animal이 되는거고,
 * Animal 위에, 혹은 Object 이런거는 못온다.
 * */
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        animal.sound();
    }


    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
