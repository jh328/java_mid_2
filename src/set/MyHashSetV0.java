package set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];

    private int size = 0;

    /**
     * 나한테 있는지 다 확인을 해야 하니깐 O(n)이다.
     * */
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }


    /**
     * elementData 값을 다 확인을 하니깐 O(n)이다.
     */
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }

}
