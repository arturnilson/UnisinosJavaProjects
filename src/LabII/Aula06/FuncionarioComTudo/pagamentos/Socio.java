package LabII.Aula06.FuncionarioComTudo.pagamentos;

public class Socio implements Bonificavel {

    private double prolabore;

    public Socio(double prolabore) {
        this.prolabore = prolabore;
    }

    @Override
    public double getBonificacao() {
        return prolabore * 1.70;
    }

}
