package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    /**
     * 생성자에서 배열을 생성한다.
     * 기본 크기를 정해야 하니깐, 상수를 넣는다.
     * 생성자를 만들면 5라는 값으로 만들어지는거다.
     * 기본 생성자는 크기가 5인거다.
     */
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 두번째 생성자는
     * 직접 정해줄 수 있는 생성자는 넘겨주는 값이 정해지는거다.
     */
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object object) {
        elementData[size] = object;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object object = get(index);
        elementData[index] = element;
        return object;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
    }
}
