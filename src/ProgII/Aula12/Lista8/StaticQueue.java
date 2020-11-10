package ProgII.Aula12.Lista8;

/*
  Artur Nilson
*/

public class StaticQueue<E> implements Queue<E> {
    protected int first;
    protected int last;
    protected E elements[];

    public StaticQueue(int maxSize) {
        elements = (E[]) new Object[maxSize];
        first = last = -1;
    }

    @Override
    public int numElements() {
        if (isEmpty())
            return 0;
        else {
            int n = elements.length;
            return ((n + last - first) % n) + 1;
        }
    }

    @Override
    public boolean isEmpty() {
        return first == -1;
    }

    @Override
    public boolean isFull() {
        return first == ((last + 1) % elements.length);
    }

    @Override
    public E front() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("A fila está vazia!");
        return elements[first];
    }

    @Override
    public E back() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("A fila está vazia!");
        return elements[last];
    }

    @Override
    public void enqueue(E element) throws OverflowException {
        if (isFull())
            throw new OverflowException("A fila está cheia!");
        else {
            if (last == -1)
                first = last = 0;
            else
                last = (last + 1) % elements.length;
            elements[last] = element;
        }
    }

    @Override
    public E dequeue() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("A fila já está vazia");
        E element = elements[first];
        elements[first] = null;
        if (first == last)
            first = last = -1;
        else
            first = (first + 1) % elements.length;
        return element;
    }

    @Override
    public void prependQueue(Queue<Integer> q1, Queue<Integer> q2) throws UnderflowException, OverflowException {
        StaticQueue<Integer> qAux = new StaticQueue<Integer>(q1.numElements() + q2.numElements());

        while (!q2.isEmpty()) {
            qAux.enqueue(q2.dequeue());
        }
        while (!q1.isEmpty()) {
            qAux.enqueue(q1.dequeue());
        }
        while (!qAux.isEmpty()) {
            q1.enqueue(qAux.dequeue());
        }

    }

    @Override
    public void exterminateFromQueue(Queue<Character> q, char element) throws UnderflowException, OverflowException {
        char backup = 0;
        int elementNum = q.numElements();
        for (int i = 0; i < elementNum; i++) {
            backup = q.dequeue();
            if (backup != element) {
                q.enqueue(backup);
            }
        }
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Fila vazia!";
        else {
            String s = "[" + elements[first];
            int n = numElements();
            for (int i = 1; i < n; i++) {
                int k = (first + i) % elements.length;
                s += ", " + elements[k];
            }
            s += "]";
            return s;
        }
    }

}
