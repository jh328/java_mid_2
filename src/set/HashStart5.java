package set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 1;

    public static void main(String[] args) {

        /**
         * 링크드리스트를 사용을 한 이유는 충돌할 확률이 거의 없다.
         * 가끔 충돌하면 그때만 데이터를 추가를 해주면 된다.
         * ArrayList는 미리 배열을 확보하고 하는데, 링크드리스트는 그런게 아니라
         * 진짜 가끔 충돌이 일어나는데 충돌이 일어날 때 추가를 해서 넣어주면 되기 때문에
         * 메모리 사용 고려해서 링크드리스트를 사용을 했다.
         * */
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println(Arrays.toString(buckets));


        // 검색
        int searchValue =9;
        boolean searchResult = contains(buckets, searchValue);
        System.out.println("searchResult = " + searchResult + ", searchValue" + searchValue);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        /**
         * 배열에 해쉬 인덱스를 넣어야  한다.그러면 링크드 리스트가 튀어나온다(버킷)
         *예전에는 int로 값을 넣었는데 지금은 그게 안된다. 왜냐하면 중ㅂ족으로 데이터가 들어갈 수 있기 때문에 자료구조를 넣어놔야 한다.
         * */
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)

        /**
         * 버킷에 값을 넣어주는데, 버킷에 같은 값이 들어가 있는지 확인을 해야 한다.
         * 즉 중복체크
         * 중복값이 아니면 값을 넣어주면 된다. 같은 값이 있으면 굳이 지금 넣어줄 필요가 없다고 함. 중복체크는 O(n)
         * 값을 아무곳에 다 넣는게 아닌, 먼저 9 인덱스 [99,9] 다른 값이 들어갈 수 있는데 같은 값이 안들어가게 체크를 하는거다.
         * 왜 다른 값이 들어가면 안되는지 물어볼 수 있는데 나중에 set을 만들 건데 set은 자료가 중복이 되면 안되서 그렇다.
        */
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue);//O(n)
    }
}
