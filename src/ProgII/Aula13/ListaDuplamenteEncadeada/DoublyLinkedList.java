package ProgII.Aula13.ListaDuplamenteEncadeada;

public class DoublyLinkedList<E> implements List<E> {
    protected DNode<E> head;
    protected DNode<E> tail;
    protected int numElements;

    public DoublyLinkedList() {
        numElements = 0;
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public E get(int pos) {
        if (pos < 0 || pos >= numElements)
            throw new IndexOutOfBoundsException("Fora de range!");

        DNode<E> current = head;
        if (pos == 0) {
            return current.getElement();
        } else {
            for (int i = 0; i < pos; i++)
                current = current.getNext();

            return current.getElement();
        }
    }

    @Override
    public void insertFirst(E insertItem) {
        DNode<E> n = new DNode<E>(insertItem);

        if (isEmpty())
            head = tail = n;
        else {
            head.setPrevious(n);
            n.setNext(head);
            head = n;
        }
        numElements++;
    }

    @Override
    public void insertLast(E insertItem) {
        DNode<E> n = new DNode<E>(insertItem);

        if (isEmpty())
            head = tail = n;
        else {
            tail.setNext(n);
            n.setPrevious(tail);
            tail = n;
        }
        numElements++;
    }

    @Override
    public void insert(E insertItem, int pos) {
        if (pos < 0 || pos > numElements)
            throw new IndexOutOfBoundsException("Fora de range!");

        if (pos == 0)
            insertFirst(insertItem);
        else if (pos == numElements)
            insertLast(insertItem);
        else {
            DNode<E> prev = head;

            for (int i = 0; i < pos - 1; i++)
                prev = prev.getNext();

            DNode<E> newNode = new DNode<E>(insertItem);
            newNode.setPrevious(prev);
            newNode.setNext(prev.getNext());
            prev.getNext().setPrevious(newNode);
            prev.setNext(newNode);
            numElements++;
        }

    }

    @Override
    public E removeFirst() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("Lista vazia!");

        E removedItem = head.getElement();
        if (head == tail)
            head = tail = null;
        else {
            head = head.getNext();
            head.setPrevious(null);
        }

        numElements--;

        return removedItem;
    }

    @Override
    public E removeLast() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException("Lista vazia!");

        E removedItem = tail.getElement();
        if (head == tail)
            head = tail = null;
        else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }

        numElements--;
        return removedItem;
    }

    @Override
    public void print() {
        DNode<E> current = head;

        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    @Override
    public int search(E element) {
        DNode<E> current = head;
        int i = 0;

        while (current != null) {
            if (element.equals(current.getElement()))
                return i;
            i++;
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public E remove(int pos) throws UnderflowException {
        if (pos < 0 || pos >= numElements)
            throw new IndexOutOfBoundsException("Fora de range");

        if (pos == 0)
            return removeFirst();
        else if (pos == numElements)
            return removeLast();
        else {
            DNode<E> prev = head;

            for (int i = 0; i < pos - 1; i++) {
                prev = prev.getNext();
            }

            E element = prev.getNext().getElement();
            prev.setNext(prev.getNext().getNext());

            DNode<E> next = prev.getNext();
            next.setPrevious(prev);

            numElements--;
            return element;
        }
    }

    public int somaPares(List<E> lista) {
        int somaPar = 0;
        for (int i = 0; i < numElements; i++) {
            if ((Integer) lista.get(i) % 2 == 0) {
                System.out.println("Par encontrado: " + lista.get(i));
                somaPar += (Integer) lista.get(i);
            }
        }
        return somaPar;
    }

    public void swap(int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0 || pos1 > numElements || pos2 > numElements) {
            throw new IndexOutOfBoundsException("Fora de range!");
        } else {
            DNode<E> cPos1 = head;
            DNode<E> cPos2 = head;

            for (int i = 0; i < pos1; i++)
                cPos1 = cPos1.getNext();

            for (int i = 0; i < pos2; i++)
                cPos2 = cPos2.getNext();

            E trocador = cPos1.getElement();
            cPos1.setElement(cPos2.getElement());
            cPos2.setElement(trocador);
        }

    }
}
