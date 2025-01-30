package com.customizedArrayList;

public class CustomizedArrList {
    private static int DEFAULT_SIZE = 10;
    int[] array = new int[DEFAULT_SIZE];
    private static int size = 0;

    boolean isFull () {
        if (size == DEFAULT_SIZE) {
            return true;
        }
        return false;
    }

    void extendSize() {
        int[] newArray = new int[DEFAULT_SIZE * 2];
        if (DEFAULT_SIZE >= 0) System.arraycopy(array, 0, newArray, 0, DEFAULT_SIZE);
        array = newArray;
        DEFAULT_SIZE = DEFAULT_SIZE * 2;
    }

    int size() {
        return size;
    }

    void add(int value) {
        if (isFull()){
            extendSize();
        }
        array[size++] = value;
    }


    void set(int pos, int value) {
        if (isFull()) {
            extendSize();
        }
        array[pos] = value;
    }

    int get(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid Position");
        }
        return array[pos];
    }

    boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size-1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size-1]);
        sb.append("]");
        return sb.toString();
    }
}
