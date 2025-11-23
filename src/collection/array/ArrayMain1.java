package collection.array;

import java.util.Arrays;

/**
 * 정수형 배열을 5개 선언을 하면
 * 5개의 공간이 만들어진다.
 * index 입력에서 0(1)
 * 0는 빅오라는 표기법이다.
 * 자료구조에서 데이터를 몇번의 계산으로 찾냐는건데, 빅오에 대해서 다음 시간에 빅오 표기법 설명을 한다.
 * 지금은 한번만에 찾을 수 있구나 라고 이해를 하면 된다.
 * */
public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        /**
         * 특정 인덱스의 값을 넣는 행위는 한번에 값이 들어간다.
         * 계산 하는데 배열의 특정 위치를 찾는거에 있어서 한번 밖에 안된다.
         * 배열의 위치를 바로 찾을 수 있다.
         * */
        System.out.println("== index 입력 : 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr)); // arr 이라고 하면 참조값이 나와서 toString 사용하면 된다.
        System.out.println();

        // index 변경 0(1)
        System.out.println("== index 변경 : 0(1)==");
        arr[2] = 10;
        System.out.println("변경 = " + Arrays.toString(arr));

        System.out.println();
        System.out.println("== index 조회 : 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println();
        System.out.println("== index 검색 : 0(1)==");

        System.out.println();
        System.out.println("== 배열 검색 : 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 값을 찾음");
                break;
            }
        }

    }
}
