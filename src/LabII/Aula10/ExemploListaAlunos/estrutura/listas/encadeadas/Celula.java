package LabII.Aula10.ExemploListaAlunos.estrutura.listas.encadeadas;

public class Celula {
    private Object elemento;
    private Celula proxima;

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
}
