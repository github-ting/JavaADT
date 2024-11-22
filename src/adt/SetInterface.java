package adt;

public interface SetInterface<T> extends Iterable<T> {

    boolean add(T newElement);

    boolean remove(T anElement);
    
    boolean set(T oldElement, T newElement);

    boolean isEmpty();
    
    boolean contains(T element);
    
    int size();
    
    void clear();
    
    void reverse();
    
    void sort();
    
    void sort(String... atributeNames);
}
