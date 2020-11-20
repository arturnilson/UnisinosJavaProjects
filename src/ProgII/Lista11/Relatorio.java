package ProgII.Lista11;

/*
    Artur Nilson
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Relatorio implements IRelatorio {
    private SinglyLinkedList<VendaLoja> listVendasPorLoja;

    public Relatorio() {
        listVendasPorLoja = new SinglyLinkedList<>();
    }

    @Override
    public void load(File file) throws IOException {
        BufferedReader loadFile = new BufferedReader(new FileReader(file));

        String line = loadFile.readLine();

        while (line != null) {
            boolean controleInsertNovaVenda = false;
            String[] splitted = line.split(";");

            VendaLoja venda = new VendaLoja(splitted[0], splitted[1], Integer.parseInt(splitted[3]),
                    Double.parseDouble(splitted[4]));

            for (int indx = 0; indx < listVendasPorLoja.numElements(); indx++) {
                if ((splitted[0].equals(listVendasPorLoja.get(indx + 1).getLoja()))
                        && (splitted[1].equals(listVendasPorLoja.get(indx + 1).getUf()))) {
                    listVendasPorLoja.get(indx + 1).somaQtde(venda.getQtde());
                    listVendasPorLoja.get(indx + 1).somaValorVenda(venda.getVlrVenda());
                    controleInsertNovaVenda = true;
                }
            }

            if (controleInsertNovaVenda == false) {
                listVendasPorLoja.insertLast(venda);
            }

            line = loadFile.readLine();
        }

        loadFile.close();
    }

    @Override
    public String show() {
        StringBuilder string = new StringBuilder();
        int totalQtde = 0;
        double totalVenda = 0;

        string.append("\t\tVendas por Loja\n");
        string.append("===============================================\n");
        for (int i = 1; i <= listVendasPorLoja.numElements(); i++) {
            VendaLoja venda = listVendasPorLoja.get(i);
            string.append(venda.getLoja() + "\t\t");
            string.append(venda.getUf() + "\t");
            string.append(venda.getQtde() + "\t");
            string.append(venda.getVlrVenda() + "\n");
            totalQtde += venda.getQtde();
            totalVenda += venda.getVlrVenda();
        }

        NumberFormat f = new DecimalFormat("#.00");

        string.append("===============================================\n");
        string.append("\t\t\t\t" + totalQtde + "\t" + f.format(totalVenda));

        return string.toString();
    }

    @Override
    public String showBestStore() {
        StringBuilder string = new StringBuilder();
        double maiorValor = 0;
        string.append("\tLoja(s) com a Maior Venda\n");
        string.append("===============================================\n");

        for (int i = 1; i <= listVendasPorLoja.numElements(); i++) {
            VendaLoja venda = listVendasPorLoja.get(i);
            if (venda.getVlrVenda() >= maiorValor) {
                maiorValor = venda.getVlrVenda();
            }
        }

        for (int y = 1; y <= listVendasPorLoja.numElements(); y++) {
            VendaLoja venda = listVendasPorLoja.get(y);
            if (venda.getVlrVenda() >= maiorValor) {
                string.append(venda.getLoja() + "\t\t");
                string.append(venda.getUf() + "\t");
                string.append(venda.getQtde() + "\t");
                string.append(venda.getVlrVenda() + "\n");
            }
        }
        string.append("===============================================\n");
        return string.toString();
    }

    @Override
    public void save(File file) throws IOException {
        BufferedWriter saveFile = new BufferedWriter(new FileWriter(file, true));

        for (int i = 1; i <= listVendasPorLoja.numElements(); i++) {
            VendaLoja venda = listVendasPorLoja.get(i);
            saveFile.write(toString(venda));
            saveFile.newLine();
            saveFile.flush();
        }
        saveFile.close();
    }

    public String toString(VendaLoja loja) {
        return loja.getLoja() + ";" + loja.getUf() + ";" + loja.getQtde() + ";" + loja.getVlrVenda();
    }

}
