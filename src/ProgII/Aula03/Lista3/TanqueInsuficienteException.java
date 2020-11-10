package ProgII.Aula03.Lista3;

public class TanqueInsuficienteException extends Exception {
    private String msg;

    public TanqueInsuficienteException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "TanqueInsuficienteException [" + this.msg + "]";
    }
}
