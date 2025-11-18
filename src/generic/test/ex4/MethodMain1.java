package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        // Integer i1 = (Integer) GenericMethod.objectMethod(i);
        // System.out.println("i1 = " + i1);
        Object object = GenericMethod.objectMethod(i);

        /**
         * 제네릭 메서드는 <T> 정의를 해줘야 한다.
         * 제네릭은 타입 매개변수를 뭘로 할지 정해줘야 한다.
         * 제네릭 메서드는 호출 할 때 정해줘야 한다.
         * 앞에 다이아몬드를 넣어주면 된다.
         * 그러면 해당 메서드는 Integer로 변경이 되서 실행을 한다.
         * */
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        Integer num = GenericMethod.<Integer>numberMethod(i);

    }
}
