package ProgII.Aula10;

/*
  Artur Nilson
*/

public class StaticStack<E> implements Stack<E> {

    protected int top;
    protected E elements[];

    public StaticStack(int maxSize) {
        elements = (E[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public int numElements() {
        return (top + 1);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == elements.length - 1;
    }

    @Override
    public E top() throws UnderFlowException {
        if (isEmpty()) {
            throw new UnderFlowException("Pilha vazia.");
        }

        return elements[top];
    }

    @Override
    public void push(E element) throws OverflowException {
        if (isFull()) {
            throw new OverflowException("Pilha cheia.");
        }
        elements[++top] = element;

    }

    @Override
    public E pop() throws UnderFlowException {
        if (isEmpty()) {
            throw new UnderFlowException("Pilha vazia.");
        }
        E element = elements[top];
        elements[top--] = null;

        return element;
    }

    public String toString() {
        if (isEmpty()) {
            return "[Empty]";
        } else {
            String s = "[";
            for (int i = numElements() - 1; i >= 0; i--) {
                s += "\n" + elements[i];
            }
            s += "\n]";
            return s;
        }
    }

}
