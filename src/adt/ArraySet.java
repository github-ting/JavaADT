package adt;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArraySet<T> implements SetInterface<T>, Serializable, Iterator<T>, Iterable<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 5;

    public ArraySet() {
        this(DEFAULT_CAPACITY);
    }

    public ArraySet(int initialCapacity) {
        numberOfEntries = 0;
        array = (T[]) new Object[initialCapacity];
    }
    
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public boolean add(T newElement) {
        if (contains(newElement)) {
            return false;
        }

        if (numberOfEntries == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        array[numberOfEntries] = newElement;
        numberOfEntries++;

        return true;
    }

    @Override
    public boolean remove(T anElement) {
        int index = indexOf(anElement);

        if (index == -1) {
            return false;
        } else {
            for (int i = index + 1; i < numberOfEntries; i++) {
                array[i - 1] = array[i];
            }

            numberOfEntries--;
            array[numberOfEntries] = null;
        }

        return true;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }

        return false;
    }

    public int indexOf(T element) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }

        return -1;
    }

    private int currentIndex;

    @Override
    public boolean hasNext() {
        return currentIndex < numberOfEntries;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T element = array[currentIndex];
            currentIndex++;
            return element;
        }

        return null;
    }

    @Override
    public Iterator<T> iterator() {
        currentIndex = 0;
        return this;
    }

    @Override
    public boolean set(T oldElement, T newElement) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
                return true;
            }
        }
        
        return false;
    }

    @Override
    public int size() {
        return numberOfEntries;
    }

    @Override
    public void clear() {
        numberOfEntries = 0;
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void reverse() {
        for (int i = 0; i < numberOfEntries; i++) {
            swap(i, numberOfEntries - i - 1);
        }
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sort(String... atributeNames) {
        for (int i = 0; i < numberOfEntries - 1; i++) {
            for (int j = 0; j < numberOfEntries - i - 1; j++) {
                try {
                    if ((int) (array[j].getClass().getMethod("compareTo", array[j].getClass(), String[].class).invoke(array[j], array[j + 1], atributeNames)) > 0) {
                        swap(j, j+1);
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    return;
                }
            }
            
        }
    }
    
    private void swap(int firstIndex, int secIndex) {
        T temp = array[firstIndex];
        array[firstIndex] = array[secIndex];
        array[secIndex] = temp;
    }
}
