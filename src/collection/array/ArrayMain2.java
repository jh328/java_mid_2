package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        System.out.println("첫 번째 배열에 값 추가 O(n)");
        int firstValue = 3;
        addFirst(arr, firstValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 밀고 배열의 인덱스 위치 추가
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        // 배열 마지막에 인덱스 추가
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int value) {
        arr[arr.length -1] = value;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        // addFirst 메서드랑 똑같은데, 크기가 인덱스까지만 이동을 하는거다.
        // 중간에 넣는것은 인덱스까지만 이동을 하면 된다.
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
    }

    /**
     * 첫 번째 값을 추가하면
     * 값을 오른쪽으로 옮겨놔야 한다.
     * 그걸 for문으로 해야한다.
     * */
    private static void addFirst(int[] arr, int firstValue) {
        /*
        * 해당 반복문은 미는연산이다.
        * 오른쪽으로 미는연산임.
        * */
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // 반복문이 끝나면 첫 번째 위치에 새로운 값을 할당을 하면 된다.
        arr[0] = firstValue;
    }
}
