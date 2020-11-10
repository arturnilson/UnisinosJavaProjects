package ProgII.Aula03.Lista3;

public class ArCondicionado {
    private int temperaturaAtual;

    public ArCondicionado(int i) {
        this.temperaturaAtual = i;
    }

    public void aumentaTemperatura(double tempMais) throws RangeTemperatura {
        temperaturaAtual += tempMais;
    }

    public void diminuiTemperatura(double tempMenos) throws RangeTemperatura {
        temperaturaAtual -= tempMenos;
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    // public void aumentaTemperatura(double tempMais) throws RangeTemperatura {
    // double atualizaTemperatura = this.temperaturaAtual + tempMais;

    // try {

    // if (atualizaTemperatura > 32.0) {
    // throw new IllegalArgumentException();
    // }

    // this.temperaturaAtual += tempMais;
    // System.out.println("Temperatura ajustada para: " + this.temperaturaAtual +
    // "ºC");
    // } catch (IllegalArgumentException iae) {
    // System.out.println("Valor acima da temperatura permitida.");
    // }
    // }

    // public void diminuiTemperatura(double tempMenos) throws RangeTemperatura {
    // double atualizaTemperatura = this.temperaturaAtual - tempMenos;
    // try {

    // if (atualizaTemperatura < 16.0) {
    // throw new IllegalArgumentException();
    // }

    // this.temperaturaAtual -= tempMenos;
    // System.out.println("Temperatura ajustada para: " + this.temperaturaAtual +
    // "ºC");
    // } catch (IllegalArgumentException iae) {
    // System.out.println("Valor abaixo da temperatura permitida.");
    // }
    // }

}