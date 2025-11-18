package generic.test.ex4;

/**
 * 제네릭 타입과 제네릭 메서드는 다른거다.
 * 제네릭 타입은 클래스에<T>라고 한다.
 * 제네릭 타입은 클래스, 인터페이스 옆에 다이아몬드를 생성해서 정의하고,
 * 타입 인자는 객체를 생성해서 전달을 하는거다. 이때 타입 인자가 결정이 된다.
 *
 * 제네릭 메서드는 언제 되냐,
 * 메서드 앞에 <T> 반환 값 앞에 다이아몬드를 정의를 하는거다.
 * 제네릭 타입은 객체를 생성할 때 사용 했지만,
 * 제네릭 메서드는 메서드를 호출 하는 시점에 결정을 하고 호출을 하는거다.
 * Integer를 제네릭으로 호출 해서 사용을 하게 되면 Integer를 반환해서 사용할 수 있게 해준다.
 *
 * */
public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println("Object print = " + obj);
        return obj;
    }

    /**
     * 메서드 하나에도 제네릭을 쓸 수 있다.
     * 먼저 제네릭 메서드인걸 알려주기 위해서 다이아몬드를 사용을 해야 한다.
     * 반환 타입 앞에 다이아몬드로 타입 매개변수를 선언을 해줘야 한다.
     * 이렇게 하면 메서드 안에서만 한정적으로 사용할 수 있는 메서드가 된다.
     * */
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print = " + t);
        return t;
    }

    /**
     * 타입 매개변수에 대해서 제한을 할 수 있다.
     *
     * */
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("B ound print = " + t);
        return t;
    }
}
