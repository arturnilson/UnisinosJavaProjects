package ProgII.TesteGA;

public class Ex4 {

    public double calculaMediaPares10Plus(int[][] m) throws IllegalArgumentException {
        double media = 0;
        int index = 0;
        int qtd = m.length * m[0].length;

        try {
            if (qtd > 10) {
                throw new IllegalArgumentException("Tamanho do array não pode ser maior que [10][10]");
            }

            for (int linha = 0; linha < m.length; linha++) {
                for (int coluna = 0; coluna < m[linha].length; coluna++) {
                    if (m[linha][coluna] % 2 == 0 && m[linha][coluna] > 10) {
                        media += m[linha][coluna];
                        index++;
                    }
                }
            }

            return media / index;

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return -1;
    }
}
