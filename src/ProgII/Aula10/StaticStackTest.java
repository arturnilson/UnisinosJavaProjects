package ProgII.Aula10;

/*
  Artur Nilson
*/

public class StaticStackTest {
    public static void main(String[] args) throws OverflowException {
        StaticStack<Integer> s = new StaticStack<Integer>(10);
        StaticStack<Integer> p1 = new StaticStack<Integer>(6);
        StaticStack<Integer> p2 = new StaticStack<Integer>(6);
        StaticStack<Integer> pNovo = new StaticStack<Integer>(6);
        StaticStack<Character> c = new StaticStack<Character>(10);
        StaticStack<Integer> l = new StaticStack<Integer>(10);

        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            p1.push(6);
            p1.push(4);
            p1.push(3);
            p1.push(1);

            p2.push(5);
            p2.push(2);

            int i = 0;
            String j = "arara";
            j = j.replaceAll(" ", "");
            while (!c.isFull() && j.length() - 1 >= i) {
                c.push(j.charAt(i++));
            }

            StaticStack<Character> k = new StaticStack<Character>((c.numElements() / 2));
            while (!k.isFull()) {
                k.push(c.pop());
            }
            if (c.numElements() % 2 != 0 || c.numElements() > k.numElements()) {
                c.pop();
            }

            System.out.println("---=== Exercício 4 ===---\n");

            while (!k.isEmpty()) {
                if (c.top() == k.top()) {
                    k.pop();
                    c.pop();
                } else {
                    System.out.println(j + " não é um palíndromo");
                    break;
                }
            }
            if (k.isEmpty()) {
                System.out.println(j + " é um palíndromo");
            }

            while (!pNovo.isFull()) {
                if (p1.isEmpty()) {
                    pNovo.push(p2.pop());
                } else if (p2.isEmpty()) {
                    pNovo.push(p1.pop());
                } else {
                    if (p1.top() > p2.top()) {
                        pNovo.push(p2.pop());
                    } else {
                        pNovo.push(p1.pop());
                    }
                }
            }
            System.out.println("\n---=== Exercício 3 ===---\n");
            System.out.println("\nSaída 1: 5 4 3 6 7 8 9 2 1 0");
            l.push(0);
            l.push(1);
            l.push(2);
            l.push(3);
            l.push(4);
            l.push(5);
            System.out.println(l.pop()); // 5
            System.out.println(l.pop()); // 4
            System.out.println(l.pop()); // 3
            l.push(6);
            System.out.println(l.pop()); // 6
            l.push(7);
            System.out.println(l.pop()); // 7
            l.push(8);
            System.out.println(l.pop()); // 8
            l.push(9);
            System.out.println(l.pop()); // 9
            System.out.println(l.pop()); // 2
            System.out.println(l.pop()); // 1
            System.out.println(l.pop()); // 0

            System.out.println("\nSaída 2: 0 1 2 3 4 5 6 7 8 9");
            i = 0;
            l = new StaticStack<Integer>(10);

            while (i < 10) {
                l.push(i++);
                System.out.println(l.pop());
            }

            System.out.println("\nSaída 3: 3 2 1 0 9 4 5 6 7 8");
            l = new StaticStack<Integer>(10);
            l.push(0);
            l.push(1);
            l.push(2);
            l.push(3);
            System.out.println(l.pop()); // 3
            System.out.println(l.pop()); // 2
            System.out.println(l.pop()); // 1
            System.out.println(l.pop()); // 0
            l.push(4);
            l.push(5);
            l.push(6);
            l.push(7);
            l.push(8);
            l.push(9);
            System.out.println(l.pop()); // 9
            System.out.println("Essa saída não pode ser feita! O único número permitido a seguir é 8!");
            System.out.println("Elementos na pilha: \n" + l.toString());

            System.out.println("\nSaída 4: 1 2 3 4 5 6 7 8 9 0");
            l = new StaticStack<Integer>(10);
            l.push(0);
            l.push(1);
            System.out.println(l.pop()); // 1
            l.push(2);
            System.out.println(l.pop()); // 2
            l.push(3);
            System.out.println(l.pop()); // 3
            l.push(4);
            System.out.println(l.pop()); // 4
            l.push(5);
            System.out.println(l.pop()); // 5
            l.push(6);
            System.out.println(l.pop()); // 6
            l.push(7);
            l.push(8);
            l.push(9);
            System.out.println(l.pop()); // 9
            System.out.println(l.pop()); // 8
            System.out.println(l.pop()); // 7
            System.out.println(l.pop() + "\n"); // 0

        } catch (OverflowException | UnderFlowException e) {
            e.printStackTrace();
        }

        try {
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
            System.out.println("---=== Exercício 2 ===---");
            System.out.println();
            while (!pNovo.isEmpty()) {
                System.out.println(pNovo.pop());
            }
        } catch (UnderFlowException e) {
            e.printStackTrace();
        }
    }
}
