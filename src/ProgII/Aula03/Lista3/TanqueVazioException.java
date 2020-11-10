package ProgII.Aula03.Lista3;

public class TanqueVazioException extends Exception {
    private String msg;

    public TanqueVazioException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "TanqueVazioException [" + this.msg + "]";
    }
}