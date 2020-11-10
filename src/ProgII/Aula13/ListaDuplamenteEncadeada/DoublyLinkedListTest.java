package ProgII.Aula13.ListaDuplamenteEncadeada;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        try {
            System.out.println("---=== Exercício 1 ===---");
            list.insertLast(1);
            list.insertLast(8);
            list.insertLast(6);
            list.insertLast(2);
            list.insertLast(4);
            list.insertLast(9);
            list.print();
            System.out.println();

            System.out.println("Removendo primeiro elemento");
            System.out.println(list.removeFirst());
            System.out.println();

            list.print();
            System.out.println();

            System.out.println("Removendo segundo elemento");
            System.out.println(list.remove(2));
            System.out.println();

            list.print();
            System.out.println();

            System.out.println("---=== Exercício 2 ===---");
            System.out.println("Soma dos pares");
            System.out.println(list.somaPares(list));
            System.out.println();

            System.out.println("---=== Exercício 3 ===---");
            System.out.println("Lista original:");
            list.print();

            list.swap(0, 2);
            System.out.println("Lista depois da troca de 0 - 2:");
            list.print();

            list.swap(1, 2);
            System.out.println("Lista depois da troca de 1 - 2:");
            list.print();

            list.swap(0, 3);
            System.out.println("Lista depois da troca de 0 - 3:");
            list.print();

        } catch (UnderflowException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
