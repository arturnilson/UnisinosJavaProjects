package ProgII.Aula12.Lista8;
/*
  Artur Nilson
*/

public class UnderflowException extends Exception {
    private String mensagem;

    public UnderflowException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String toString() {
        return "Underflow Exception: " + mensagem;
    }
}