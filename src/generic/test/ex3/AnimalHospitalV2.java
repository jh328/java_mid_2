package generic.test.ex3;

/**
 * getName, getSize 같은 컴파일 오류가 나온다.
 * T 타입을 메서드를 정의하는 시점에는 알 수 없다.
 * Object의 기능만 사용할 수 있다.
 * T 타입은 무슨 타입인지 알 수 없다.
 * checkUp이라는 메서드를 작성 하고 있는데, 여기서 문제점은
 * animal이라는 타입을 작성하는 시점에 알 수 없다.
 * 우리가 코드를 작성을 하는 컴파일 시점에서는 이때는 animal이 뭔 지 알 수 없다.
 * 그래서 무슨 문제점이 생기냐면 getName, getSize 호출 할 수 없다.
 * T라고 하면, 컴파일 시점에서는 오브젝트로 사용할지, Integer로 사용할지 모른다.
 * Integer 사용한다고 하면 T가 Integer가 된다.
 * 그러면 Integer에 getName, getSize가 없어서 호출 할 수 없다.
 * dog,cat,number,double 어떤 타입으로 들어올지 모른다.
 * 그래서 T에 대해서 쓸 수 있는 기능은 Object 밖에 없다.
 * Object는 모든 객체의 부모이기 때문에 toString, equals, hashCode 이런것만 사용할 수 있다.
 * 그러면 죄다 컴파일 에러가 나와서 전부 못쓰는거다.
 *
 * 컴파일 에러를 없애기 위해서 메서드를 다 주석 처리를 한다.
 *
 * 제네릭 타입을 선언을 하면 자바 컴파일러 입장에서 T에 어떤 값이 들어올지 예측할 수 없다.
 * 아래 코드 어디에도 Animal에 대한 정보가 없다.
 * 자바 컴파일러는 어떤 타입이 들어올 지 알 수 없기 때문에 T를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 Object 타입으로 가정한다.
 * 따라서 Object가 제공하는 메서드만 호출 할 수 있다.
 * */
public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }/***/

    public void checkUp() {
        animal.toString();
        animal.equals(null);
        /*System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        animal.sound();*/
    }


    public T bigger(T target) {
        return null;
//        return animal.getSize() > target.getSize() ? animal : target;
    }
}
