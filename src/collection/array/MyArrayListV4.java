package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E object) {
        // 동적배열 강의
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = object;
        size++;
    }

    // 동적 배열
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        /*Object[] numArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            numArr[i] = elementData[i];
        }*/
        elementData = Arrays.copyOf(elementData, newCapacity);;
    }

    public void add(int index, E e) {
        // 동적배열 강의
        if (size == elementData.length) {
            grow();
        }
        // 인덱스에 값을 추가를 하기 전에 먼저 이동을 하고 넣어야 한다.
        // 이동 하는걸 shift라고 한다.
        shiftRightFrom(index);

        elementData[index] = e;
        size++;
    }

    /*오른쪽으로 밀기*/
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    // 삭제 하는 값이 어떤 값이 반환을 해줄꺼다.
    // 삭제를 할 때 데이터 이동을 해야 한다. 0번 인덱스에서 삭제를 하면 왼쪽으로 이동을 해야 하고, 마지막에는 null을 넣어주면 된다.
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    /**
     * 자바에서 경고를 주는걸 무시하는 단축키
     * option + enter
     * Inspection "unchecked warinig ~
     * Supperess for emthod 클릭
     * 자바 컴파일러가 애노테이션 주석을 보고 경고를 없애준다.
     * */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E object = get(index);
        elementData[index] = element;
        return object;
    }

    public int indexOf(E o) {
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
