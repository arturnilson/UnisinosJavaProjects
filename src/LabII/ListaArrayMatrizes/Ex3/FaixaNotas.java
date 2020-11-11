package LabII.ListaArrayMatrizes.Ex3;

public class FaixaNotas {
    private Faixas faixas = new Faixas();

    public String[] montaGraficoBarras(int[] notas) {
        String[] barras = new String[notas.length];

        for (int indx = 0; indx < barras.length; indx++) {
            barras[indx] = faixas.getFaixa(notas[indx]);
        }

        return barras;
    }
}
