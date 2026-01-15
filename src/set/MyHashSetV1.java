package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        /*
            해당 코드가 중복이여서, option + com + m
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }*/
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hash = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hash];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public boolean contains(int searchValue) {
        int hash = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hash];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        System.out.println("remove value = " + value);
        int hashIndex = hashIndex(value);
        System.out.println("hashIndex = " + hashIndex);
        LinkedList<Integer> bucket = buckets[hashIndex];
        System.out.println("bucket = " + bucket);
        boolean result = bucket.remove(Integer.valueOf(value));
        System.out.println("result = " + result);
        // 조건문에서 return true 둘 다 사용을 하면 되는데, 왜 true, false를 나눠서 하는거야?
        // 그리고 remove 메서드 용도가 result 값이 줄어들면 size 변수 값을 줄이기만 하면 되는데 여기서 else를 사용을 한 이유는 뭘까?
        // 실무에서는 이렇게 하는 이유가 궁금해
        if (result) {
            size--;
            System.out.println("size = " + size);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    public int getSize() {
        return size;
    }
}
