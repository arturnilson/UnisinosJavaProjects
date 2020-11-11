package LabII.Aula06.FuncionarioComTudo.pagamentos;

public class ControleBonificacoes {
    private static final int NUMERO_FUNCIONARIOS = 10;
    private Bonificavel[] folha;
    private int numeroElementos;

    public ControleBonificacoes() {
        folha = new Bonificavel[NUMERO_FUNCIONARIOS];
        numeroElementos = 0;
    }

    public void registraBonificacao(Bonificavel funcionario) {
        folha[numeroElementos] = funcionario;
        numeroElementos++;
    }

    public double getTotalBonificacoes() {
        double total = 0;

        for (int indx = 0; indx < folha.length; indx++) {
            if (folha[indx] != null) {
                total = total + folha[indx].getBonificacao();
            }
        }

        return total;
    }
}
