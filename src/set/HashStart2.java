package set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        // 데이터 입력을 1,2,5,8로 할 시
        // [0,1,2,0,0,5,0,0,8,0]
        // [null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer i = inputArray[searchValue]; // O(1)이다. 배열의 인덱스를 값으로 사용하는거고 이게 핵심이다. 배열의 인덱스를 값으로 사용하는거고 O(n) -> O(1)로 사용하는거다. 검색인데, searchValue가 8로 변경이 되고, 이거는 계산 한번에 8번째에 있는 위치를 한번에가서 꺼내오는거다.

        System.out.println("i = " + i);
    }
}
