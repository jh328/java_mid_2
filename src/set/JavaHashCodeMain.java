package set;

import set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println("object1.hashCode() = " + object1.hashCode());
        System.out.println("object2.hashCode() = " + object2.hashCode());

        System.out.println("object1 = " + Integer.toHexString(object1.hashCode()));
        System.out.println("object1 = " + object1);

        Integer i = 10;
        String a = "A";
        String b = "AB";

        System.out.println("i = " + i.hashCode());
        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("b.hashCode() = " + b.hashCode());

        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 물리적으로는 다르지만, 논리적으로 같다고 생각. 해시코드는 똑같이 나옴.
        // 이유는 Member.hashCode 오버라이딩 한 코드 때문에 그렇고, 해당 코드가 없으면 해시코드 값이 다르게 나온다.
        // 참조값이 다르기 땜누에 참조값을 기준으로 해시코드를 출력을 한다.
        // 다르게 나오면 큰일이 난다. 배열에 같은 인덱스를 정확하게 맞춰야 거기서 내 데이터를 찾을 수 있는데
        // 해시 코드가 다르면 배열에서 찾을 때 다른곳에서 찾게 된다. 그렇기 때문에 문제가 생길 수 있다.
        Member m1 = new Member("idA");
        Member m2 = new Member("idA");
        // 비교시작
        System.out.println("m1 ==m2 = " + (m1 == m2));
        System.out.println("m1 eqm2 = " + m1.equals(m2));
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());


    }
}
