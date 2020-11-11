package LabII.Aula10.ExemploListaAlunos.estrutura.listas.encadeadas.duplas;

public class Celula {
    private Object elemento;
    private Celula proxima;
    private Celula anterior;

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Object elemento, Celula proxima) {
        this(elemento);
        setProxima(proxima);
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getProxima() {
        return proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}
