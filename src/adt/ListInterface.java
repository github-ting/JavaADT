package adt;

public interface ListInterface<T> {
    /**
     * Add a new element to the end of the list.
     *
     * @param element The new element to be added.
     * @return {@code true} if the element is successfully added to the list,
     *         {@code false} otherwise.
     */
    boolean add(T element);

    /**
     * Insert a new element at the specified index in the list.
     *
     * @param index The index at which the element will be inserted.
     * @param element The new element to be inserted.
     * @return {@code true} if the element is successfully inserted at the specified index,
     *         {@code false} otherwise.
     */
//    boolean add(int index, T element);
    
    /**
     * Set the element at the specified index with a new element.
     *
     * @param index The index of the element to be replaced.
     * @param element The new element to replace the existing element.
     * @return {@code true} if the element at the specified index is successfully replaced,
     *         {@code false} otherwise.
     */
    boolean set(int index, T element);

    /**
     * Remove the element at the specified index from the list.
     *
     * @param index The index of the element to be removed.
     * @return {@code true} if the element at the specified index is successfully removed,
     *         {@code false} otherwise.
     */
    boolean remove(int index);

    /**
     * Remove the first occurrence of the specified element from the list.
     *
     * @param element The element to be removed.
     * @return {@code true} if the element is successfully removed from the list,
     *         {@code false} if the element is not found.
     */
    boolean remove(T element);

    /**
     * Check if the list is empty (contains no elements).
     *
     * @return {@code true} if the list is empty, {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Check if the list contains the specified element.
     *
     * @param element The element to be checked for existence in the list.
     * @return {@code true} if the element is found in the list, {@code false} otherwise.
     */
    boolean contains(T element);

    /**
     * Get the element at the specified index in the list.
     *
     * @param index The index of the element to be retrieved.
     * @return The element at the specified index in the list.
     */
    T get(int index);

    /**
     * Find the index of the first occurrence of the specified element in the list.
     *
     * @param element The element to find the index for.
     * @return The index of the first occurrence of the element, or {@code -1} if not found.
     */
    int indexOf(T element);

    /**
     * Get the number of elements in the list.
     *
     * @return The number of elements in the list.
     */
    int size();

    /**
     * Remove all elements from the list, making it empty.
     */
    void clear();

    /**
     * Reverse the order of elements in the list.
     */
    void reverse();
    
    void sort();
    
    void sort(String... atributeNames);
    
    void swap(int firstIndex, int secIndex);
}