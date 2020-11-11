package LabII.ExemploCelular.eletronicos;

public class Celular {
    private String modelo;
    private String marca;
    private SistemaOperacional so;
    private Aplicativos apps;

    public Celular(String modelo, String marca, SistemaOperacional so) {
        this.modelo = modelo;
        this.marca = marca;
        this.so = so;
        apps = new Aplicativos();
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public SistemaOperacional getSo() {
        return so;
    }

    public String[] getApps() {
        return apps.getApps();
    }

    public void instala(int posicao, String app) {
        apps.adicionaApp(posicao, app);
    }

}
