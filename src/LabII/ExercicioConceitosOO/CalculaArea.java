package LabII.ExercicioConceitosOO;

public class CalculaArea {
    private double a;
    private double b;
    private double c;

    public CalculaArea(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getAreaTriangulo() {
        System.out.println(
                "Área do triângulo com base " + getA() + " e altura " + getB() + " é: " + (getA() * getB()) / 2);
    }

    public void getAreaCirculo() {
        System.out.println("Área do círculo com raio " + getC() + " é: " + (Math.PI * (getC() * getC())));
    }

    public void getAreaTrapezio() {
        System.out.println("Área do trapézio com bases " + getA() + " e " + getB() + " e altura " + getC() + " é: "
                + ((getA() + getB()) * getC()) / 2);
    }

    public void getAreaQuadrado() {
        System.out.println("Área do quadrado com lado " + getB() + " é: " + (getB() * getB()));
    }

    public void getAreaRetangulo() {
        System.out.println("Área do retângulo com lados " + getA() + " e " + getB() + " é: " + (getA() * getB()));
    }

    public void getAreaSuperficieCubo() {
        System.out.println("Área da superfície do cubo com aresta " + getC() + " é: " + ((getC() * getC()) * 6));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

}
