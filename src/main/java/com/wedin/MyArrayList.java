package com.wedin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MyArrayList<E> implements Iterable<E> {

    private E[] array;
    private int size;

    public MyArrayList(E... args) {
        this.size = args.length;
        this.array = Arrays.copyOf(args, args.length);
    }

    public MyArrayList(List<E> list) {
        this.size = list.size();
        this.array = (E[]) list.toArray();
    }

    public int size() {
        return size;
    }

    public void add(int index, E element) {
        if (this.size < index)
            throw new IndexOutOfBoundsException();
        else if (this.array.length - 1 > index && this.array.length > size) {
            System.arraycopy(this.array, index, this.array, index + 1, size - index);
            this.array[index] = element;
            this.size++;
        } else {
            E[] newArray = (E[]) new Object[size * 2];
            System.arraycopy(this.array, 0, newArray, 0, index);
            System.arraycopy(this.array, index, newArray, index + 1, size - index);
            newArray[index] = element;
            this.array = newArray;
            this.size++;
        }
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        for (int i = 0; i < size; i++) action.accept(this.array[i]);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    @Override
    public boolean equals(Object obj) {
        return Arrays.equals(this.toArray(), ((MyArrayList<E>) obj).toArray());
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public Iterator<E> iterator() {
        return null;
    }
}
