package ProgII.Aula13.ListaSimplesmenteEncadeada;

/*
    Artur Nilson
*/

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
        try {
            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(1);

            System.out.println(lista.numElements());
            System.out.println(lista.get(0));
            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(2);

            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(3);

            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(4);

            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(5);

            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(6);

            System.out.println();
            System.out.println(lista.numElements());
            lista.insertFirst(7);

            System.out.println();
            System.out.println(lista.numElements());
            System.out.println(lista.toString());
            System.out.println();
            lista.addBefore(8, 7);

            System.out.println(lista.numElements());
            System.out.println();

            System.out.println(lista.toString());
            lista.addAfter(9, 0);

            System.out.println(lista.toString());
            System.out.println(lista.numElements());
            System.out.println();

            int get = lista.get(2);
            System.out.println(get);
            System.out.println("Teste conversão inteiro");
            System.out.println(lista.convertToInt());

            int somaLista = 0;
            System.out.println(lista.get(9));
            somaLista = lista.somaElementos(lista);

            System.out.println();
            System.out.println("Imprimindo soma dos elementos da lista!");
            System.out.println(somaLista);
            System.out.println();

            System.out.println(lista);
            while (!lista.isEmpty()) {
                System.out.println(lista.removeFirst());
            }

        } catch (UnderflowException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
