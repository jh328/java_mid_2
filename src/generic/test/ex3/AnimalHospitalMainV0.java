package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("고양이", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        System.out.println();

        catHospital.set(cat);
        catHospital.checkUp();

        // 개 병원에 고양이 인수 전달
//        dogHospital.set(cat); 당연 에러

        // 개 타입 반환
        Dog d = dogHospital.bigger(new Dog("강아지1", 200));
        System.out.println("d = " + d);
    }
}
