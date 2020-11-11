package LabII.Laboratorio1_Banco.testes;

import LabII.Laboratorio1_Banco.banco.Conta;

public class ContaTeste {
    public static void main(String[] args) {
        Conta c = new Conta("25513");

        System.out.println(c.toString());
        System.out.println();
        c.depositar(250);
        System.out.println(c.toString());
        System.out.println();
        c.sacar(150);
        System.out.println(c.toString());
        System.out.println();
        c.depositar(250);
        System.out.println(c.toString());
        System.out.println();
        c.sacar(150);
        System.out.println(c.toString());

        c.sacar(225);
        System.out.println(c.toString());
    }
}
