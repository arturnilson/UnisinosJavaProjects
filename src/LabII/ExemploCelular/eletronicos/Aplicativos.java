package LabII.ExemploCelular.eletronicos;

public class Aplicativos {
    private String[] apps;

    public Aplicativos() {
        apps = new String[10];
    }

    public void adicionaApp(int posicao, String nome) {
        apps[posicao] = nome;
    }

    public String[] getApps() {
        return apps;
    }
}
