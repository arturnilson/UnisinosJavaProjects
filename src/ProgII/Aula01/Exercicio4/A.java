package ProgII.Aula01.Exercicio4;

public class A {
    public A() { // Contrutor A
        System.out.println("Chamada construtor A");
    }

    public A(int x) { // Sobrecarga
        System.out.println("Chamada construtor A com 1 parâmetro");
    }

    public void m1() { // Método m1
        System.out.println("Chamada método m1 de A");
    }

    public void m1(int h) { // Sobrecarga
        System.out.println("Chamada método m1 de A com parâmetro");
    }
}