package LabII.Laboratorio2_Cinema.cinema;

public class Assento {
    private String assento;
    private boolean ocupado;

    public Assento() {
        this.assento = "[ ]";
        this.ocupado = false;
    }

    public String getAssento() {
        return assento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

}
