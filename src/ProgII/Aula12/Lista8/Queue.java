package ProgII.Aula12.Lista8;

/*
  Artur Nilson
*/

public interface Queue<E> {
    public int numElements();

    public boolean isEmpty();

    public boolean isFull();

    // Inspeciona e retorna o primeiro elemento da fila
    public E front() throws UnderflowException;

    // Inspeciona e retorna o último elemento da fila
    public E back() throws UnderflowException;

    // Insere um elemento no final da fila
    public void enqueue(E element) throws OverflowException;

    // Remove o elemento na frente da fila
    public E dequeue() throws UnderflowException;

    public void prependQueue(Queue<Integer> q1, Queue<Integer> q2) throws UnderflowException, OverflowException;

    public void exterminateFromQueue(Queue<Character> q, char element) throws UnderflowException, OverflowException;
}
