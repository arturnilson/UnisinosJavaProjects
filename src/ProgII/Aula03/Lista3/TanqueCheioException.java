package ProgII.Aula03.Lista3;

public class TanqueCheioException extends Exception {
    private String msg;

    public TanqueCheioException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "TanqueCheioException [" + this.msg + "]";
    }
}