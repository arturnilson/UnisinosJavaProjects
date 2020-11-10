package ProgII.Aula12.Lista8;

/*
  Artur Nilson
*/

public class StaticQueueTest {
    public static void main(String[] args) {
        StaticQueue<Integer> q = new StaticQueue<Integer>(5);
        try {
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);

            System.out.println(q.dequeue());
            System.out.println(q.dequeue());

            q.enqueue(5);
            q.enqueue(6);
            q.enqueue(7);

            System.out.println(q.toString());

            // Exercício 1
            System.out.println("\n----==== Exercício 1 ====----");
            while (!q.isEmpty()) {
                System.out.println(q.dequeue());
            }
            System.out.println();

            // Exercício 2
            StaticQueue<Integer> q1 = new StaticQueue<Integer>(10);
            StaticQueue<Integer> q2 = new StaticQueue<Integer>(5);

            q1.enqueue(1);
            q1.enqueue(2);
            q1.enqueue(3);
            q1.enqueue(4);
            q2.enqueue(5);
            q2.enqueue(6);
            q2.enqueue(7);
            q2.enqueue(8);

            System.out.println("\n----==== Exercício 2 ====----");
            q1.prependQueue(q1, q2);
            System.out.println(q1.toString());
            System.out.println(q2.toString());

            // Exercício 3
            StaticQueue<Integer> f = new StaticQueue<Integer>(5);
            System.out.println("\n----==== Exercício 3 ====----");
            foobar(f);

            System.out.println("Sequencia após chamada do método: " + f);
            System.out.println("( F )");
            System.out.println("( V )");

            // Exercício 4
            StaticQueue<Character> qChar = new StaticQueue<Character>(10);
            qChar.enqueue('a');
            qChar.enqueue('b');
            qChar.enqueue('o');
            qChar.enqueue('b');
            qChar.enqueue('o');
            qChar.enqueue('r');
            qChar.enqueue('a');
            System.out.println("\n----==== Exercício 4 ====----");
            System.out.println(qChar.toString());
            qChar.exterminateFromQueue(qChar, 'o');
            System.out.println(qChar.toString());

        } catch (OverflowException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (UnderflowException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void foobar(Queue<Integer> f) {
        try {
            f.enqueue(1);
            f.enqueue(3);
            f.enqueue(5);
            f.enqueue(7);
            f.enqueue(9);
        } catch (OverflowException e) {
            System.out.println(e);
        }

        try {
            f.dequeue();
            f.dequeue();
        } catch (UnderflowException e) {
            System.out.println(e);
        }

        try {
            f.enqueue(2);
            f.enqueue(4);
        } catch (OverflowException e) {
            System.out.println(e);
        }

        try {
            f.dequeue();
        } catch (UnderflowException e) {
            System.out.println(e);
        }

        try {
            f.enqueue(3);
        } catch (OverflowException e) {
            System.out.println(e);
        }
    }
}
