package ProgII.Aula01.Exercicio2;

public class Filha extends Pai {

    public Filha() { // Construtor Filha
        System.out.println("Construtor de Filha");
    }

    public void m1() { // Sobrescrita
        System.out.println("Chamada função m1 em Filha");
    }

    public void m3() { // Método m3
        System.out.println("Chamada função m3 em Filha");
    }
}