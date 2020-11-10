package ProgII.Aula08.ListasLineares;

/*
  Artur Nilson
*/

public class StaticListTest {
    public static void main(String[] args) {
        List<Integer> lista = new StaticList<Integer>(10);
        List<Integer> lista2 = new StaticList<Integer>(20);

        for (int i = 0; i < 10; i++) {
            lista.insert(i * 2, i);
            lista2.insert(i * i, i);
        }

        System.out.println("Lista após inserções");
        System.out.println(lista);
        System.out.println();

        System.out.println("Lista 2 após inserções");
        System.out.println(lista2);
        System.out.println();

        System.out.println(lista.remove(5) + " foi removido da lista!");

        System.out.println("\nLista após remoção do elemento na posição 5: ");
        System.out.println(lista.toString());
        System.out.println();

        ((StaticList<Integer>) lista2).merge(lista);
        System.out.println("Listas Concatenadas: ");
        System.out.println(lista2);
        System.out.println();

        System.out.println("Sub Lista");
        List<Integer> lista3 = ((StaticList<Integer>) lista2).subList(2, 8);
        System.out.println(lista3);
    }
}
