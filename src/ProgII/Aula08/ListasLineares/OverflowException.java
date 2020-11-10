package ProgII.Aula08.ListasLineares;

public class OverflowException extends Exception {
    private String msg;

    public OverflowException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "OverflowException [" + this.msg + "]";
    }
}
