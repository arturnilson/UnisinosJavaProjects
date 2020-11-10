package ProgII.Aula10;
/*
  Artur Nilson
*/

public class UnderFlowException extends Exception {
    private String mensagem;

    public UnderFlowException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String toString() {
        return "UnderFlowException [" + mensagem + "]";
    }
}
