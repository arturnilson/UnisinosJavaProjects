package LabII.ListaArrayMatrizes.Ex3;

public class Faixas {

    private String[] faixas;

    public Faixas() {
        faixas = new String[11];
        faixas[0] = "";
        faixas[1] = "";
        faixas[2] = "";
        faixas[3] = "**";
        faixas[4] = "******";
        faixas[5] = "***";
        faixas[6] = "*************";
        faixas[7] = "******";
        faixas[8] = "***";
        faixas[9] = "**";
        faixas[10] = "**";
    }

    public String getFaixa(int value) {
        String faixa = "";

        if (value < 0 || value > 100) {
            faixa = "Fora da faixa";
        }

        if (value >= 0 && value <= 9) {
            faixa = faixas[0];
        } else if (value > 9 && value <= 19) {
            faixa = faixas[1];
        } else if (value > 19 && value <= 29) {
            faixa = faixas[2];
        } else if (value > 29 && value <= 39) {
            faixa = faixas[3];
        } else if (value > 39 && value <= 49) {
            faixa = faixas[4];
        } else if (value > 49 && value <= 59) {
            faixa = faixas[5];
        } else if (value > 59 && value <= 69) {
            faixa = faixas[6];
        } else if (value > 69 && value <= 79) {
            faixa = faixas[7];
        } else if (value > 79 && value <= 89) {
            faixa = faixas[8];
        } else if (value > 89 && value <= 99) {
            faixa = faixas[9];
        } else if (value > 99 && value <= 100) {
            faixa = faixas[10];
        }

        return faixa;
    }

}
