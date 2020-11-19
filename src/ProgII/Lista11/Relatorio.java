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
            String[] splitted = line.split(";");
            String loja = splitted[0];
            String uf = splitted[1];
            int nroNotaFiscal = Integer.parseInt(splitted[2]);
            int qtde = Integer.parseInt(splitted[3]);
            double valorVenda = Double.parseDouble(splitted[4]);

            listVendas.add(new VendaLoja(loja, uf, qtde, valorVenda, nroNotaFiscal));
            line = loadFile.readLine();
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
        StringBuilder string = new StringBuilder();
        string.append("[\n");
        for (int x = listVendas.size() - 1; x >= 0; x--) {
            VendaLoja venda = listVendas.get(x);
            string.append("Loja\t" + venda.getLoja() + "\n");
            string.append("UF\t" + venda.getUf() + "\n");
            string.append("NF\t" + venda.getNotaFiscal() + "\n");
            string.append("Qtd\t" + venda.getQtde() + "\n");
            string.append("Valor\t" + venda.getVlrVenda() + "\n\n");
        }
        string.append("]");

        return string.toString();
    }

}
