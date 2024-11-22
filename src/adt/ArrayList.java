package adt;

import java.util.Arrays;

public class ArrayList<T> implements ListInterface<T> {

    private T[] array;
    private int noOfEntries = 0;
    private static final int DEFAULT_CAPACITY = 5;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int size) {
        noOfEntries = 0;
        array = (T[]) new Object[size];
    }

    public ArrayList(T[] array) {
        noOfEntries = array.length;
        this.array = array;
    }

    @Override
    public boolean add(T element) {
        if (noOfEntries == Integer.MAX_VALUE) {
            return false;
        }

        if (noOfEntries == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        array[noOfEntries] = element;
        noOfEntries++;
        return true;
    }

    @Override
    public boolean set(int index, T element) {
        if (index < 0 || index >= noOfEntries) {
            return false;
        }

        array[index] = element;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= noOfEntries) {
            return false;
        }

        noOfEntries--;
        for (int i = index; i < noOfEntries; i++) {
            array[i] = array[i + 1];
        }

        return true;
    }

    @Override
    public boolean remove(T element) {
        int index = indexOf(element);

        return remove(index);
    }

    @Override
    public boolean isEmpty() {
        return noOfEntries == 0;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < noOfEntries; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= noOfEntries) {
            return null;
        }

        return array[index];
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < noOfEntries; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return noOfEntries;
    }

    @Override
    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        noOfEntries = 0;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < noOfEntries / 2; i++) {
            swap(i, noOfEntries - i - 1);
        }
    }

    @Override
    public void swap(int firstIndex, int secIndex) {
        if (firstIndex < 0 || firstIndex >= noOfEntries || secIndex < 0 || secIndex >= noOfEntries || firstIndex == secIndex) {
            return;
        }

        T tempObj = array[firstIndex];
        array[firstIndex] = array[secIndex];
        array[secIndex] = tempObj;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < noOfEntries; i++) {
            str += (i + 1) + ". " + array[i].toString() + "\n";
        }

        return str;
    }

    @Override
    public void sort() {
        quickSort(0, noOfEntries - 1);
    }

    @Override
    public void sort(String... attributeNames) {
        quickSort(0, noOfEntries - 1, attributeNames);
    }

    private int partition(int low, int high) {
        // Choosing the pivot
        T pivot = array[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (((Comparable)array[j]).compareTo(pivot) <= -1) {

                // Increment index of smaller element
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return (i + 1);
    }

    private int partition(int low, int high, String... attributeNames) {
        // Choosing the pivot
        T pivot = array[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        try {
            for (int j = low; j <= high - 1; j++) {
                // If current element is smaller than the pivot
                if ((int) (array[j].getClass().getMethod("compareTo", array[j].getClass(), String[].class).invoke(array[j], pivot, attributeNames)) <= -1) {

                    // Increment index of smaller element
                    i++;
                    swap(i, j);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
        swap(i + 1, high);
        return (i + 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private void quickSort(int low, int high, String... attributeNames) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(low, high, attributeNames);

            // Separately sort elements before
            // partition and after partition
            quickSort(low, pi - 1, attributeNames);
            quickSort(pi + 1, high, attributeNames);
        }
    }
}
