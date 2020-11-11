package LabII.ExercicioConceitosOO;

public class CalculaAreaTeste {
    public static void main(String[] args) {
        CalculaArea a = new CalculaArea(10, 5, 6);

        a.getAreaTriangulo();
        a.getAreaCirculo();
        a.getAreaTrapezio();
        a.getAreaQuadrado();
        a.getAreaRetangulo();
        a.getAreaSuperficieCubo();
    }
}
