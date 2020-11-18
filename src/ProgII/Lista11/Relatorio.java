package ProgII.Lista11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Relatorio implements IRelatorio {
    private LinkedList<VendaLoja> listVendas;

    public Relatorio() {
        listVendas = new LinkedList<>();
    }

    @Override
    public void load(File file) throws IOException {
        BufferedReader loadFile = new BufferedReader(new FileReader(file));

        String line = loadFile.readLine();

        while (line != null) {
            System.out.println(line);
            line = loadFile.readLine();
            String[] splitted = line.split(";");

            String loja = splitted[0];
            String uf = splitted[1];
            int nroNotaFiscal = Integer.parseInt(splitted[2]);
            int qtde = Integer.parseInt(splitted[3]);
            double valorVenda = Double.parseDouble(splitted[4]);

            System.out.println(loja);
            System.out.println(uf);
            System.out.println(nroNotaFiscal);
            System.out.println(valorVenda);
            // listVendas.add(new VendaLoja(loja, uf, qtde, valorVenda, nroNotaFiscal));
        }

        loadFile.close();
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void showBestStore() {
        // TODO Auto-generated method stub

    }

    @Override
    public void save(File file) throws IOException {
        BufferedWriter saveFile = new BufferedWriter(new FileWriter(file));
    }

    public String toString() {
        return listVendas.toString();
    }

}
