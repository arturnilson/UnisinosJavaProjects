package LabII.ExercicioConceitosOO;

public class ContaTeste {
    public static void main(String[] args) {
        Conta c = new Conta("12345");

        c.depositar(500);
        System.out.println(c.toString());
        c.sacar(250);
        System.out.println(c.toString());
        c.sacar(300);

    }
}
