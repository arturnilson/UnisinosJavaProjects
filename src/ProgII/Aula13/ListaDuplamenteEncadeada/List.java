package ProgII.Aula13.ListaDuplamenteEncadeada;

public interface List<E> {
    public boolean isEmpty();

    public boolean isFull();

    public int numElements();

    public E get(int pos);

    public void insertFirst(E insertItem);

    public void insertLast(E insertItem);

    public void insert(E insertItem, int pos);

    public E removeFirst() throws UnderflowException;

    public E removeLast() throws UnderflowException;

    public void print();

    public int search(E element);

    public E remove(int pos) throws UnderflowException;
}
