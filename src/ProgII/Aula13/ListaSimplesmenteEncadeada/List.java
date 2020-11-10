package ProgII.Aula13.ListaSimplesmenteEncadeada;

/*
    Artur Nilson
*/

public interface List<E> {
    public boolean isEmpty();

    public boolean isFull();

    public E get(int n);

    public int numElements();

    public void insertFirst(E element);

    public void insertLast(E element);

    public void insert(E element, int pos);

    public E removeFirst() throws UnderflowException;

    public E removeLast() throws UnderflowException;

    public E remove(int pos) throws UnderflowException;

    public int search(E element);
}
