package LabII.ExercicioConceitosOO;

public class Circulo {
    private Ponto origem;
    private int raio;

    public Circulo(int raio, Ponto origem) {
        this.origem = origem;
        this.raio = raio;
    }

    public Circulo(int raio, int x, int y) {
        this.raio = raio;
        origem = new Ponto(x, y);
    }

    public double getArea(int raio) {
        return Math.PI * (raio * raio);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * this.raio;
    }
}