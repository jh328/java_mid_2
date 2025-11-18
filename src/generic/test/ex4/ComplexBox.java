package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    /**
     * 프로그래밍에서 우선순위가 있으면 상식적으로 생각을 해야 한다.
     * 타입 매개변수는 전체적인 범위이고,
     * 타입 메서드의 t는 클래스 보다 메서드에 있는 t가 더 가깝다.
     * 메서드가 가까워서 여기에 걸리는거다.
     * 항상 프로그래밍에서 가깝고, 구체적인게 우선순위가 높다.
     * */
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className = " + t.getClass().getName());
        return t;
    }
}
