package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integerAnimalHospitalV3 = new AnimalHospitalV3<Integer>();
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        System.out.println();

        catHospital.set(cat);
        catHospital.checkUp();

        // 개 병원에 고양이 인수 전달
//        dogHospital.set(cat);

        // 개 타입 반환
        dogHospital.set(dog);
        Dog dog1 = dogHospital.bigger(new Dog("강아지1", 200));
        System.out.println("dog1 = " + dog1);
    }
}
