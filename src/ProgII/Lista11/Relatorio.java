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
    private LinkedList<VendaLoja> listVendasPorLoja;

    public Relatorio() {
        listVendas = new LinkedList<>();
        listVendasPorLoja = new LinkedList<>();
    }

    @Override
    public void load(File file) throws IOException {
        BufferedReader loadFile = new BufferedReader(new FileReader(file));

        String line = loadFile.readLine();

        while (line != null) {
            String[] splitted = line.split(";");

            VendaLoja venda = new VendaLoja(splitted[0], splitted[1], Integer.parseInt(splitted[3]),
                    Double.parseDouble(splitted[4]), Integer.parseInt(splitted[2]));

            // String loja = splitted[0];
            // String uf = splitted[1];
            // int nroNotaFiscal = Integer.parseInt(splitted[2]);
            // int qtde = Integer.parseInt(splitted[3]);
            // double valorVenda = Double.parseDouble(splitted[4]);

            // int posicaoVenda = listVendas.indexOf(venda);

            // if (posicaoVenda > -1) {
            // double valor = listVendas.get(posicaoVenda).getVlrVenda();
            // int quantidade = listVendas.get(posicaoVenda).getQtde();

            // listVendas.get(posicaoVenda).somaValorVenda(valor);
            // listVendas.get(posicaoVenda).somaQtde(quantidade);

            // } else {
            // listVendas.add(venda);
            // }

            listVendas.add(venda);
            line = loadFile.readLine();
        }

        loadFile.close();
    }

    private void trataSavePorLoja() {
        for (int indx = 0; indx < listVendas.size() - 1; indx++) {
            VendaLoja venda = listVendas.get(indx);

            for (int indy = 1; indy < listVendas.size(); indy++) {
                VendaLoja venday = listVendas.get(indy);

                if (venda.getLoja().equalsIgnoreCase(venday.getLoja())
                        && venda.getUf().equalsIgnoreCase(venday.getUf())) {
                    venday.somaQtde(venda.getQtde());
                    venday.somaValorVenda(venda.getVlrVenda());
                } else {
                    listVendasPorLoja.add(venday);
                }
            }

        }
    }

    @Override
    public void show() {

    }

    @Override
    public void showBestStore() {
        // TODO Auto-generated method stub

    }

    @Override
    public void save(File file) throws IOException {
        BufferedWriter saveFile = new BufferedWriter(new FileWriter(file, true));

        for (VendaLoja loja : listVendas) {
            saveFile.write(toString(loja));
            saveFile.newLine();
            saveFile.flush();
        }
        saveFile.close();
    }

    public String toString(VendaLoja loja) {
        return loja.getLoja() + ";" + loja.getUf() + ";" + loja.getNotaFiscal() + ";" + loja.getQtde() + ";"
                + loja.getVlrVenda();
    }

    public String showListaVendas() {
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

    public String showListaVendasLoja() {
        StringBuilder string = new StringBuilder();
        string.append("[\n");
        for (int x = listVendasPorLoja.size() - 1; x >= 0; x--) {
            VendaLoja venda = listVendasPorLoja.get(x);
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
