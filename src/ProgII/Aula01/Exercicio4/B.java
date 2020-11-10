package ProgII.Aula01.Exercicio4;

public class B extends A {

    public B() { // Construtor B
        System.out.println("Chamada construtor B");
    }

    public void m1() { // Sobrescrita
        super.m1();
        System.out.println("Chamada função m1 em B");
    }

    public void m1(int x, double y) { // Sobrecarga
        System.out.println("Chamada função m1 com 2 parâmetros em B");
    }

    public int m2() { // Método m2
        System.out.println("Chamada função m2 em B");
        return 0;
    }

}
