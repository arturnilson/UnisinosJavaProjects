package ProgII.Aula03.Lista3;

public class Carro {
    private double capacidadeMax;
    private double nivelCombustivel;
    private double kmPorLitro;

    public Carro(double capacidadeMax, double nivelCombustivel, double kmPorLitro) {
        this.capacidadeMax = capacidadeMax;
        this.nivelCombustivel = nivelCombustivel;
        this.kmPorLitro = kmPorLitro;
    }

    public void encherTanque(double combustivel) throws TanqueCheioException {
        try {
            if ((this.nivelCombustivel + combustivel) > this.capacidadeMax) {
                throw new TanqueCheioException("Quantidade informada não cabe no tanque.");
            }

            this.nivelCombustivel += combustivel;
            System.out.println("Nivel de combustível atualizado é: " + this.nivelCombustivel);
        } catch (TanqueCheioException TCE) {
            System.out.println(TCE.toString());
        }
    }

    public double distanciaPossivel() {
        return getNivelCombustivel() * getKmPorLitro();
    }

    public double combustivelGasto(double distancia) {
        return distancia / getKmPorLitro();
    }

    public void andar(double distancia) throws TanqueVazioException, TanqueInsuficienteException {
        try {
            double combustivel_gasto = combustivelGasto(distancia);

            if (getNivelCombustivel() == 0) {
                throw new TanqueVazioException("Seu tanque está vazio.");
            }

            if (combustivel_gasto > getNivelCombustivel()) {
                throw new TanqueInsuficienteException("Você não possui gasolina suficiente para esta distância.");
            }

            this.nivelCombustivel -= combustivel_gasto;

            System.out.println(
                    "Você acabou de andar " + distancia + "km. \nSeu nível de combustível é: " + getNivelCombustivel());
        } catch (TanqueVazioException TVE) {
            System.out.println(TVE.toString());
        } catch (TanqueInsuficienteException TIE) {
            System.out.println(TIE.toString());
        }
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

}
