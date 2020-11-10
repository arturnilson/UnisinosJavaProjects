package ProgII.Aula12.Lista8;

/*
  Artur Nilson
*/

public class OverflowException extends Exception {
    private String mensagem;

    public OverflowException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String toString() {
        return "Overflow Exception: " + mensagem;
    }
}