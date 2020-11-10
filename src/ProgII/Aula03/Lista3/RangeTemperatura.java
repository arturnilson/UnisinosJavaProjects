package ProgII.Aula03.Lista3;

public class RangeTemperatura extends Exception {
    private String msg;

    public RangeTemperatura(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "RangeTemperaturaException [" + this.msg + "]";
    }
}
