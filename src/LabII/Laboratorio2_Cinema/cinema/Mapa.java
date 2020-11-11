package LabII.Laboratorio2_Cinema.cinema;

public class Mapa {
    private Assento[][] mapa;
    private int assentosLivres = 168;
    private int assentosOcupados = 0;

    public Mapa() {
        mapa = new Assento[13][14];
        this.criarMapa();
    }

    public void criarMapa() {
        for (int indx = 0; indx < mapa.length; indx++) {
            for (int indy = 0; indy < mapa[indx].length; indy++) {
                mapa[indx][indy] = new Assento();
            }
        }
    }

    public void mostrarMapa() {
        for (int indx = 0; indx < mapa.length; indx++) {
            System.out.print(" " + getLetraLinha(indx) + "  ");
            for (int indy = 0; indy < mapa[indx].length; indy++) {
                if (indx == 12) {
                    System.out.print(" " + (indy + 1 > 9 ? (indy + 1) : " " + (indy + 1)) + " ");
                } else {
                    System.out.print(" " + mapa[indx][indy].getAssento());
                }
            }
            System.out.println();
        }
    }

    public boolean reservarAssento(String linha, int coluna) {
        boolean reservou = false;
        int linhaNro = this.getNumeroLinha(linha);

        if (EhLinhaValida(linhaNro) && EhColunaValida(coluna) && !assentoOcupado(linhaNro, coluna)) {
            mapa[linhaNro][coluna - 1].setAssento("[x]");
            mapa[linhaNro][coluna - 1].setOcupado(true);
            assentosLivres--;
            assentosOcupados++;
            reservou = true;
        }

        return reservou;
    }

    public boolean cancelarReserva(String linha, int coluna) {
        boolean cancelou = false;
        int linhaNro = this.getNumeroLinha(linha);

        if (EhLinhaValida(linhaNro) && EhColunaValida(coluna) && assentoOcupado(linhaNro, coluna)) {
            mapa[linhaNro][coluna - 1].setAssento("[ ]");
            mapa[linhaNro][coluna - 1].setOcupado(false);
            assentosLivres++;
            assentosOcupados--;
            cancelou = true;
        }

        return cancelou;
    }

    private boolean assentoOcupado(int linhaNro, int coluna) {
        return mapa[linhaNro][coluna - 1].isOcupado();
    }

    private boolean EhLinhaValida(int linha) {
        return linha >= 0;
    }

    private boolean EhColunaValida(int coluna) {
        return coluna >= 1 && coluna <= 14;
    }

    private int getNumeroLinha(String linha) {
        String linhaUpper = linha.toUpperCase();
        int linhaInt = -1;

        switch (linhaUpper) {
            case "A":
                linhaInt = 0;
                break;
            case "B":
                linhaInt = 1;
                break;
            case "C":
                linhaInt = 2;
                break;
            case "D":
                linhaInt = 3;
                break;
            case "E":
                linhaInt = 4;
                break;
            case "F":
                linhaInt = 5;
                break;
            case "G":
                linhaInt = 6;
                break;
            case "H":
                linhaInt = 7;
                break;
            case "I":
                linhaInt = 8;
                break;
            case "J":
                linhaInt = 9;
                break;
            case "K":
                linhaInt = 10;
                break;
            case "L":
                linhaInt = 11;
                break;
        }
        return linhaInt;
    }

    private String getLetraLinha(int linha) {
        String letra = " ";

        switch (linha) {
            case 0:
                letra = "A";
                break;
            case 1:
                letra = "B";
                break;
            case 2:
                letra = "C";
                break;
            case 3:
                letra = "D";
                break;
            case 4:
                letra = "E";
                break;
            case 5:
                letra = "F";
                break;
            case 6:
                letra = "G";
                break;
            case 7:
                letra = "H";
                break;
            case 8:
                letra = "I";
                break;
            case 9:
                letra = "J";
                break;
            case 10:
                letra = "K";
                break;
            case 11:
                letra = "L";
                break;
        }
        return letra;
    }

    public String toString() {
        return "Assentos Livres: " + this.assentosLivres + "\nAssentos Ocupados: " + this.assentosOcupados;
    }

}
