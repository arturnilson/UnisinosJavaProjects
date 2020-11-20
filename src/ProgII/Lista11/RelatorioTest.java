package ProgII.Lista11;

/*
    Artur Nilson
*/

import java.io.File;
import java.io.IOException;

public class RelatorioTest {
    public static void main(String[] args) {
        Relatorio rel = new Relatorio();

        try {
            rel.load(new File("C:/Users/artur/JavaProjectsUnisinos/src/ProgII/Lista11/vendas.txt"));
            System.out.println(rel.show());
            System.out.println(rel.showBestStore());

            // rel.save(new File("C:/Users/artur/Desktop/vendasLoja.txt"));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
