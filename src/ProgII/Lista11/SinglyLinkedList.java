package ProgII.Lista11;

/*
    Artur Nilson
*/

public class SinglyLinkedList<E> implements List<E> {
    Node<E> head;
    Node<E> tail;
    int numElements;

    public SinglyLinkedList() {
        head = tail = null;
        numElements = 0;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public boolean isFull() { // Implementar caso não seja mais uma lista dinamica
        return false;
    }

    @Override
    public E get(int n) {
        if (n < 0 || n > numElements)
            throw new IndexOutOfBoundsException("Fora do range!");

        Node<E> current = head;
        for (int i = 0; i < n - 1; i++)
            current = current.getNext();

        return current.getElement();
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public void insertFirst(E element) {
        Node<E> newNode = new Node<E>(element);

        if (isEmpty())
            head = tail = newNode;
        else {
            newNode.setNext(head);
            head = newNode;
        }

        numElements++;
    }

    @Override
    public void insertLast(E element) {
        Node<E> newNode = new Node<E>(element);

        if (isEmpty())
            head = tail = newNode;
        else {
            tail.setNext(newNode);
            tail = newNode;
        }

        numElements++;
    }

    @Override
    public void insert(E element, int pos) {
        if (pos < 0 || pos > numElements)
            throw new IndexOutOfBoundsException("Fora do range!");

        if (pos == 0)
            insertFirst(element);
        else if (pos == numElements)
            insertLast(element);
        else {
            Node<E> prev = head;
            for (int i = 0; i < pos - 1; i++)
                prev = prev.getNext();

            Node<E> newNode = new Node<E>(element);
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
            numElements++;
        }
    }

    @Override
    public E removeFirst() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("Lista vazia!");

        E element = head.getElement();

        if (head == tail)
            head = tail = null;
        else
            head = head.getNext();

        numElements--;
        return element;
    }

    @Override
    public E removeLast() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("Lista vazia!");

        E element = tail.getElement();

        if (head == tail)
            head = tail = null;
        else {
            Node<E> prev = head;
            while (prev.getNext() != tail)
                prev = prev.getNext();

            tail = prev;
            prev.setNext(null);
        }

        numElements--;
        return element;
    }

    @Override
    public E remove(int pos) throws UnderflowException {
        if (pos < 0 || pos >= numElements)
            throw new IndexOutOfBoundsException("Fora do range");

        if (pos == 0)
            return removeFirst();
        else if (pos == numElements - 1)
            return removeLast();
        else {
            Node<E> prev = head;
            for (int i = 0; i < pos - 1; i++)
                prev = prev.getNext();

            E element = prev.getNext().getElement();

            prev.setNext(prev.getNext().getNext());
            numElements--;
            return element;
        }
    }

    @Override
    public int search(E element) {
        Node<E> current = head;
        int i = 0;

        while (current != null) {
            if (element.equals(current.getElement()))
                return i;

            i++;
            current = current.getNext();
        }
        return -1;
    }

    public String toString() {
        String s = "";

        Node<E> current = head;
        while (current != null) {
            s += current.getElement().toString() + " ";
            current = current.getNext();
        }

        return s;
    }

    public void addAfter(E element, int pos) { // inserir depois do pos
        if (pos < 0 || pos > numElements) {
            throw new IndexOutOfBoundsException("Fora do range!");
        } else {
            if (pos == numElements) {
                insertLast(element);
            }
            if (pos == 0) {
                insert(element, pos + 1);
            } else {
                Node<E> prev = head;
                for (int i = 0; i < pos; i++)
                    prev = prev.getNext();

                Node<E> newNode = new Node<E>(element);
                newNode.setNext(prev.getNext());
                prev.setNext(newNode);
                numElements++;
            }
        }
    }

    public void addBefore(E element, int pos) { // inserir antes do pos
        if (pos < 0 || pos > numElements) {
            throw new IndexOutOfBoundsException("Fora do range!");
        } else {
            Node<E> prev = head;
            if (pos == 0)
                insertFirst(element);
            if (pos == numElements)
                insert(element, pos - 1);
            else {
                for (int i = 0; i < pos - 1; i++)
                    prev = prev.getNext();

                Node<E> newNode = new Node<E>(element);
                newNode.setNext(prev.getNext());
                prev.setNext(newNode);
                numElements++;
            }
        }
    }

    public int convertToInt() {
        String aux = "";
        Node<E> current = head;
        for (int i = 0; i < numElements; i++) {
            aux += current.getElement();
            current = current.getNext();
        }
        return Integer.parseInt(aux);
    }

    public int somaElementos(List<E> lista) throws UnderflowException {
        if (lista.isEmpty())
            throw new UnderflowException("Lista vazia!");
        if (numElements == 1)
            return (Integer) lista.get(0);
        else
            return somaElementos(lista, 1);
    }

    private int somaElementos(List<E> lista, int current) {
        if (current <= lista.numElements()) {
            return somaElementos(lista, current + 1) + (Integer) lista.get(current);
        } else {
            return 0;
        }

    }
}
