package generic.test.test5;

import generic.animal.Animal;

/**
 * 와일드 카드는 제네릭을 쉽게 사용할 수 있게 해주는 도구라고 우선 생각을 하면 된다.
 * static <T> void printGenericV1(Box<T> box) {
 *         System.out.println("T = " + box.get());
 *     }
 * 위의 코드 T로 정의를 하면 다른 타입으로 바뀌게 된다.
 * 이게 제네릭을 사용한거다.
 * T들이 다른 값들로 다 바뀌게 된다. 이렇게 하면 타입 매개변수에 타입 인수를 넣어서 타입을 결정 하는거고,
 * 이런 과정이 걸쳐지는게 제네릭 메서드, 제네릭 타입이다.
 *
 * 와일드 카드는 이런게 아니다.
 * Box 라는 제네릭 타입이 있고, 그걸 사용할 때 편하게 사용하고 싶을 때 하는거다.
 * 제네릭에 물음표만 넣고 그냥 만드는거다.
 *
 * printGenericV1 이거는 제네릭 메서드인거고,
 * Box는 제네릭 타입을 만드는거다.
 *
 * 와일드카드는 이미 만들어진 제네릭 타입을 갖다가 편하게 활용할 때 쓰는거다 라고 이해하면 될 것 같다.
 *
 * 제네릭 메서드랑 와일드카드랑 비슷하게 쓸 수 있다.
 * 서로 치환이 될 때 많은데,
 * 결정적으로 제네릭 메서드보다 와일드 카드가 훨씬 단순하다.
 * 제네릭 메서드를 실행한다고 하면 (printGenericV1) 타입 추론이 일어날꺼고,
 * pdf 예제를 봐야 한다.
 *
 *
 *
 * */
public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printGenericV3(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }


    static Animal printWildcardV3(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
