package ProgII.Aula10;

/*
  Artur Nilson
*/

public interface Stack<E> {
    public int numElements();

    public boolean isEmpty();

    public boolean isFull();

    public E top() throws UnderFlowException;

    public void push(E element) throws OverflowException;

    public E pop() throws UnderFlowException;
}