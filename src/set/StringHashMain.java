package set;

import java.util.Arrays;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args){
        char a = 'A';
        char b = 'B';
        System.out.println("a = " + (int)a);
        System.out.println("b = " + (int)b);

        // 문자열 -> 숫자
        int hashCode = hashCode("AB");
        System.out.println("hashCode = " + hashCode);

        int hash = hashIndex(hashCode("A"));
        System.out.println("hash = " + hash);


        System.out.println("hashIndex(B) " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) " + hashIndex(hashCode("AB")));
    }

    private static int hashCode(String str) {
        System.out.println("str = " + str);
        char[] charArray = str.toCharArray();
        System.out.println("charArray = " + Arrays.toString(charArray));
        int sum = 0;
        for (char a : charArray) {
            sum += a;
            // sum = sum + a;
        }
        return sum;
    }

    static int hashIndex(int value) {
        System.out.println("hashIndex method value = " + value);
        return value % CAPACITY;
    }
}
